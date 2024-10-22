package lesson27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testEmail() {
        Person person=new Person("kkibirieva@gmail.com", "Qwerty@12345");
        boolean result = person.isEmailValid("kkibirieva@@gmail.com");
        Assertions.assertFalse(false, String.valueOf(result));
        Assertions.assertTrue(true, String.valueOf(person.isEmailValid("kkibirieva@gmail.com")));
        Assertions.assertFalse(false, String.valueOf(person.isEmailValid("kkibirieva@gmailcom")));
        Assertions.assertFalse(false, String.valueOf(person.isEmailValid("kkibirieva@gmail.c")));

    }

    @Test
    public void testPassword(){
        Person person1=new Person("","");
        Assertions.assertFalse(false, String.valueOf(person1.isPasswordValid("12345")));
        Assertions.assertFalse(false, String.valueOf(person1.isPasswordValid("kj12345")));
        Assertions.assertTrue(true, String.valueOf(person1.isPasswordValid("Qwe12@!Kt7")));

    }

}