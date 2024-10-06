package com.learnspring.injections.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Classroom {
    private String name;
    private List<String> students;
    private Set<String> subjects;
    private Map<String, Integer> subjectWeightage;
    private Properties studentRollNumbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Map<String, Integer> getSubjectWeightage() {
        return subjectWeightage;
    }

    public void setSubjectWeightage(Map<String, Integer> subjectWeightage) {
        this.subjectWeightage = subjectWeightage;
    }

    public Properties getStudentRollNumbers() {
        return studentRollNumbers;
    }

    public void setStudentRollNumbers(Properties studentRollNumbers) {
        this.studentRollNumbers = studentRollNumbers;
    }

    public Classroom() {
    }

    public Classroom(String name, List<String> students, Set<String> subjects, Map<String, Integer> subjectWeightage, Properties studentRollNumbers) {
        this.name = name;
        this.students = students;
        this.subjects = subjects;
        this.subjectWeightage = subjectWeightage;
        this.studentRollNumbers = studentRollNumbers;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", subjects=" + subjects +
                ", subjectWeightage=" + subjectWeightage +
                ", studentRollNumbers=" + studentRollNumbers +
                '}';
    }
}
