package business.concretes;

import business.abstracts.UserSerivce;
import core.EmailValidation;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserSerivce {

    UserDao userDao;
    EmailValidation validation;


    public UserManager(UserDao userDao,EmailValidation validation) {
        this.userDao = userDao;
        this.validation=validation;
    }


    @Override
    public boolean signIn(User user) {

       if (user.getFirstName().length()>=2 && user.getLastName().length()>=2 && user.getPassword().length()>=6)
       {
           if (userDao.checkUserIsThere(user.getEmail()))
           {
               if (validation.validate(user.getEmail())){
                   return userDao.signIn(user);
               }
           }
       }

        return false;
    }

    @Override
    public boolean logIn(User user) {
        return userDao.logIn(user);
    }

    @Override
    public User get(String email) {
        return userDao.get(email);
    }
}
