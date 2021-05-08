package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users;

    @Override
    public boolean signIn(User user) {
        return true;
    }

    @Override
    public boolean logIn(User user) {
        return true;
    }

    @Override
    public boolean checkUserIsThere(String email) {
        for (User user : users){
            if (user.getEmail()==email){
                return true;
            }
        }
        return  false;
    }

    @Override
    public User get(String email) {
        for (User user : users){
            if (user.getEmail()==email){
                return user;
            }
        }
        return  null;
    }
}
