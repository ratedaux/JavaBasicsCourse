package homework45;

import lesson45.EmailValidateException;

public class ValidateApp {

    public static void main(String[] args) {

        String email="test@email.com";
        try {
            EmailValidator.isEmailValid(email);
            System.out.println("Email passed the check.");

        } catch (EmailValidateException e) {
            System.out.println("Email isn't valid.");
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
