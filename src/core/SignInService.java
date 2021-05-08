package core;

import entities.concretes.User;

public interface SignInService {
    boolean signIn(User user);
}
