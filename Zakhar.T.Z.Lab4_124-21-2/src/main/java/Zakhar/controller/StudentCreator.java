package Zakhar.controller;

import Zakhar.model.Student;
import Zakhar.model.Sex;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}