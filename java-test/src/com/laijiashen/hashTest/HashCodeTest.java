package com.laijiashen.hashTest;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Student{

    protected int id;//当前类的成员与继承该类的类能访问.

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
        //利用反射机制来实例化及使用Student类和任何从Student派生出来的类
        
        Map<Student, Score> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(stud.newInstance(i), new Score());
        }
        
//        for (int i = 0; i < 10; i++) {
//            map.put(new Student(i), new Score());
//        }

        System.out.println("map" + map);

        Student student = stud.newInstance(3);//使用id为3的Student作为键
        System.out.println("寻找学生: " + student);

        if (map.containsKey(student)) {
            System.out.println(map.get(student));
        }else {
            System.out.println("此学生不存在");
        }

    }

    public static void main(String[] args) throws Exception{
        studScore(Student.class);
    }
}
