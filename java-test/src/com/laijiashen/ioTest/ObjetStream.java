package com.laijiashen.ioTest;

import java.io.*;  

public class ObjetStream {  
   
   /** 
    * @param args 
    */  
   public static void main(String[] args) {  
      // TODO�Զ����ɵķ������  
      ObjectOutputStream objectwriter=null;  
      ObjectInputStream objectreader=null;  
       
      try {  
         objectwriter=new ObjectOutputStream(new FileOutputStream("student.txt"));  
         objectwriter.writeObject(new Student("gg", 22));  
         objectwriter.writeObject(new Student("tt", 18));  
         objectwriter.writeObject(new Student("rr", 17));  
         objectreader=new ObjectInputStream(new FileInputStream("student.txt"));  
         for (int i = 0; i < 3; i++) {  
            System.out.println(objectreader.readObject());  
         }  
      } catch (IOException | ClassNotFoundException e) {  
         // TODO�Զ����ɵ� catch ��  
         e.printStackTrace();  
      }finally{  
         try {  
            objectreader.close();  
            objectwriter.close();  
         } catch (IOException e) {  
            // TODO�Զ����ɵ� catch ��  
            e.printStackTrace();  
         }  
          
      }  
       
   }  
   
}  
class Student implements Serializable{  
   private String name;  
   private int age;  
    
   public Student(String name, int age) {  
      super();  
      this.name = name;  
      this.age = age;  
   }  
   
   @Override  
   public String toString() {  
      return "Student [name=" + name + ", age=" + age + "]";  
   }  
    
    
}  