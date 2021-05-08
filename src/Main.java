import business.concretes.UserManager;
import core.EmailValidation;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        UserManager userManager=new UserManager(new HibernateUserDao(),new EmailValidation());
        User user=new User(1,"Onur","Omer","onur@onur.com","1111111");

        userManager.signIn(user);


    }
}
