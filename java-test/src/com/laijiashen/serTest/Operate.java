package com.laijiashen.serTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���л��ͷ����л�����ز�����
 * @author С��
 * @�������� 2015-3-12
 */
class Operate{
    /**
     * ���л�����
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void serializable(Person person) throws FileNotFoundException, IOException{
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("a.txt"));
        outputStream.writeObject(person);      
    }

    /**
     * �����л��ķ���
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
        Person person=new Person("С��","123456","20");
        System.out.println("Ϊ���л�֮ǰ�������������:\n"+person.toString());
        operate.serializable(person);
        Person newPerson=operate.deSerializable();
        System.out.println("-------------------------------------------------------");
        System.out.println("���л�֮��������������:\n"+newPerson.toString());
     }


}