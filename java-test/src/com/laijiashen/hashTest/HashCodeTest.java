package com.laijiashen.hashTest;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Student{

    protected int id;//��ǰ��ĳ�Ա��̳и�������ܷ���.

    public Student(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student #" + id;
    }

}


class Score{

    private static Random random = new Random(47);

    private int score = random.nextInt(100);

    @Override
    public String toString() {
        return String.valueOf(score);
    }

}

public class HashCodeTest {
    public static <T extends Student> void studScore(Class<T> type) throws Exception{
        Constructor<T> stud = type.getConstructor(int.class);
        //���÷��������ʵ������ʹ��Student����κδ�Student������������
        
        Map<Student, Score> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(stud.newInstance(i), new Score());
        }
        
//        for (int i = 0; i < 10; i++) {
//            map.put(new Student(i), new Score());
//        }

        System.out.println("map" + map);

        Student student = stud.newInstance(3);//ʹ��idΪ3��Student��Ϊ��
        System.out.println("Ѱ��ѧ��: " + student);

        if (map.containsKey(student)) {
            System.out.println(map.get(student));
        }else {
            System.out.println("��ѧ��������");
        }

    }

    public static void main(String[] args) throws Exception{
        studScore(Student.class);
    }
}
