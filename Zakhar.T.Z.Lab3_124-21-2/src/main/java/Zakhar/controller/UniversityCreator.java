package Zakhar.controller;

import Zakhar.model.University;
import Zakhar.model.Human;
import Zakhar.model.Faculty;

import java.util.List;

public class UniversityCreator {
    public University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head, faculties);
    }
}
