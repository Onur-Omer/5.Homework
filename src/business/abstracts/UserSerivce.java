package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserSerivce {
    boolean signIn(User user);
    boolean logIn(User user);
    User get(String email);
}
