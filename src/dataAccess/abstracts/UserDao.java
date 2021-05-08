package dataAccess.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserDao {
    boolean signIn(User user);
    boolean logIn(User user);
    boolean checkUserIsThere(String email);
    User get(String email);

}
