package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService one = new UserServiceImpl();
        one.createUsersTable();
        one.saveUser("Иван", "Иванов", (byte) 33);
        one.saveUser("Наташа", "Ростова", (byte) 22);
        one.saveUser("Никита", "Ларин", (byte) 17);
        one.saveUser("Андрей", "Васильев", (byte) 55);
        one.getAllUsers().forEach(System.out::println);
        one.cleanUsersTable();
        one.dropUsersTable();
    }
}
