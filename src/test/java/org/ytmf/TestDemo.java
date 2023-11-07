package org.ytmf;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 15:33
 */
public class TestDemo {

    @Test
    public void method(){
        Student student1 = new Student(1,"zhangsan",18,35.5);
        Student student2= new Student(2,"zhangsan",19,38.5);
        Student student3 = new Student(3,"zhangsan",20,39.5);
        Student student4 = new Student(4,"zhangsan",21,55.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.sort((s1,s2) -> (int)(s1.score - s2.score));
        System.out.println(students);
    }

    @Data
    @AllArgsConstructor
    class Student{
        private Integer id;
        private String name;
        private Integer age;
        private Double score;
    }
}
