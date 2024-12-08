package Zakhar.controller;

import Zakhar.model.Group;
import Zakhar.model.Human;
import Zakhar.model.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(String name, Human head, List<Student> students) {
        return new Group(name, head, students);
    }
}
