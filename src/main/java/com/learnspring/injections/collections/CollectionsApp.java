package com.learnspring.injections.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Injecting collections
public class CollectionsApp {
    public static void main(String[] args) {
        System.out.println("Starting Collections App...");
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionsConfig.xml");
        Classroom classroom = (Classroom) context.getBean("classroom");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Class name - " + classroom.getName());
        System.out.println("List of students - " + classroom.getStudents());
        System.out.println("Set of subjects - " + classroom.getSubjects());
        System.out.println("Map of subjects with weightage - " + classroom.getSubjectWeightage());
        System.out.println("Properties of roll numbers - " + classroom.getStudentRollNumbers());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
