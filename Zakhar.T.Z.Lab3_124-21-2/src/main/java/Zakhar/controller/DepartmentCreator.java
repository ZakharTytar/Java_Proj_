package Zakhar.controller;

import Zakhar.model.Department;
import Zakhar.model.Human;
import Zakhar.model.Group;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head, List<Group> groups) {
        return new Department(name, head, groups);
    }
}
