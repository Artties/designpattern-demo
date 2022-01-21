package com.jenna.designpattern.iterator;

import java.util.HashMap;
import java.util.Map;

/*
* 不使用设计模式
*
*
* */
public class WithoutIteratorPatternDemo {
    public static void main(String[] args){
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

//        Student[] students = new Student[2];
//        students[0] = student1;
//        students[1] = student2;
        Map<String,Student> students = new HashMap<String,Student>();
        students.put(student1.getName(), student1);
        students.put(student2.getName(),student2);

        Classroom classroom = new Classroom();
        classroom.setStudents(students);

//        Student[] resultStudents = classroom.getStudents();
//        for (Student resultStudent:resultStudents){
//            System.out.println(resultStudents);
//        }
        Map<String,Student> resultStudents = classroom.getStudents();
        for (Student resultStudent : resultStudents.values()){
            System.out.println(resultStudents);
        }

    }
    public static class Student{
        private String name;
        public Student(String name){
            super();
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
//    /*
//     * 教室类
//     * */
//    public static class Classroom{
//        private Student[] students;
//
//        public Student[] getStudents(){
//            return students;
//        }
//        public void setStudents(Student[] students){
//            this.students = students;
//        }
//    }

        public static class Classroom{
        private Map<String,Student> students;

        public Map<String,Student> getStudents(){
            return students;
        }
        public void setStudents(Map<String,Student> students){
            this.students = students;
        }
    }
}

