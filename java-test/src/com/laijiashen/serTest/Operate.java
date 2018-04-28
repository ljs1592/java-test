package com.laijiashen.serTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化和反序列化的相关操作类
 * @author 小浩
 * @创建日期 2015-3-12
 */
class Operate{
    /**
     * 序列化方法
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void serializable(Person person) throws FileNotFoundException, IOException{
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("a.txt"));
        outputStream.writeObject(person);      
    }

    /**
     * 反序列化的方法
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public Person deSerializable() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        return (Person) ois.readObject();
    }

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Operate operate=new Operate();
        Person person=new Person("小浩","123456","20");
        System.out.println("为序列化之前的相关数据如下:\n"+person.toString());
        operate.serializable(person);
        Person newPerson=operate.deSerializable();
        System.out.println("-------------------------------------------------------");
        System.out.println("序列化之后的相关数据如下:\n"+newPerson.toString());
     }


}