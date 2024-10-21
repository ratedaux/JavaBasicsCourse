package homework27;

import lesson27.Person;

public class PersonApp_HW {

    public static void main(String[] args) {

        Person_HW person = new Person_HW("email", "password");
        System.out.println(person);

        person.setEmail("test@mail.com");
        System.out.println(person.getEmail());

        person.setEmail("a1@email.de");
        System.out.println(person.getEmail());

        System.out.println("\n========= \n");
        person.setEmail("a1@ema@il.de");
        person.setEmail("a1@email.d.e");
        person.setEmail("a1@emailde");
        person.setEmail("a1email.de");
        System.out.println(person.getEmail());

        System.out.println("\n============== \n");
        person.setPassword("cQ1%dfa"); // длина меньше 8
        person.setPassword("cQ1%dfa_"); // валидный пароль
        System.out.println("\n ================== ");
        person.setPassword("cQ1%dfar"); //  валидный
        person.setPassword("cQ1%dfa?"); // валидный
        person.setPassword("cQ12dfa?"); // валидный
        person.setPassword("cQ12dfa@паыпрыкры"); // валидный
        System.out.println(person.getPassword());


    }
}
