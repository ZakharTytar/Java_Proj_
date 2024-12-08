package Zakhar.controller;

import Zakhar.model.Group;
import Zakhar.model.Human;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}