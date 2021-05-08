package core;

import JGoogle.JGoogleManager;
import entities.concretes.User;

public class JGoogleManagerAdapter implements SignInService{

    JGoogleManager googleManager;

    public JGoogleManagerAdapter(JGoogleManager googleManager) {
        this.googleManager = googleManager;
    }



    @Override
    public boolean signIn(User user) {
        return googleManager.signIn(user);
    }
}
