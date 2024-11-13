package lesson45;

import homework45.PasswordValidateException;

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

        String password="Qw12qqqqqq";
        try {
            homework45.EmailValidator.isPasswordValid(password);
            System.out.println("Password passed the check;");
        } catch (PasswordValidateException p) {
            System.out.println("Password isn't valid.");
            String message1=p.getMessage();
            System.out.println(message1);
        }
    }
}
