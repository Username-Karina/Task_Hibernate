package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan","Ivanov",(byte)30);
        userService.saveUser("Petr","Petrov",(byte)25);
        userService.saveUser("Fedor","Smirnov",(byte)46);
        userService.saveUser("Katya","Sidorova",(byte)21);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
