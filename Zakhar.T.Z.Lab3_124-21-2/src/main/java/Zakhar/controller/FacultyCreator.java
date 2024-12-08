package Zakhar.controller;

import Zakhar.model.Faculty;
import Zakhar.model.Human;
import Zakhar.model.Department;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, List<Department> departments) {
        return new Faculty(name, head, departments);
    }
}
