package Zakhar.controller;

import Zakhar.model.University;
import Zakhar.model.Human;

public class UniversityCreator {
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }
}
