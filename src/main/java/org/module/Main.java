package org.module;

public class Main {
    public static void main(String[] args) {
        Student student1 = new ComputerScienceStudent();
        student1.setName("John");
        System.out.println(student1.getName());
        student1.sayHello();

        // Typecasting
        ComputerScienceStudent studentX = (ComputerScienceStudent) student1;
        studentX.setProgrammingSkill(5);
        System.out.println(studentX.getProgrammingSkill());
    }
}
