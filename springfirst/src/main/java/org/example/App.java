package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");

        Student student = (Student) context.getBean("student");
        student.internshipProgram();

        Springboot sb = (Springboot) context.getBean("springboot");
        sb.start();

        Trainer trainer = (Trainer) context.getBean("trainer");
        trainer.train();

        Institution institution = (Institution) context.getBean("institution");
        institution.hostProgram();

        Course course = (Course) context.getBean("course");
        course.displayCourse();

        System.out.println("Hello World!");
    }
}
