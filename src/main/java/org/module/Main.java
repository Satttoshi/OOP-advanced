package org.module;

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent csStudent = new ComputerScienceStudent();
        csStudent.setName("John Doe");
        csStudent.setName2("Samantha Doe");
        csStudent.setProgrammingSkill(5);
        System.out.println(csStudent.getName());
        csStudent.sayHello();
        csStudent.sayPointsAmount();

        System.out.println(); // new Line

        ComputerScienceStudentFirstYear csStundentFirstYear = new ComputerScienceStudentFirstYear();
        csStundentFirstYear.setName("Jane Doe");
        csStundentFirstYear.sayHello();
    }
}
