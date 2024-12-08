package Zakhar.controller;

import Zakhar.model.Faculty;
import Zakhar.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
