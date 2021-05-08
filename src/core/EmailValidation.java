package core;

import java.util.Scanner;

public class EmailValidation {

   public boolean validate(String email){
        System.out.println("Message send your email please enter for validation");
        Scanner readinput = new Scanner(System.in);

        String enterkey;
        enterkey = readinput.nextLine();
        if(enterkey.equals("")) {

            return true;
        }
        return false;
    }
}
