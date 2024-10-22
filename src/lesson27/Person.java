package lesson27;

public class Person {

        private String email;
        private String password;

        public Person(String email, String password) {
            setEmail(email);
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {

            if (isEmailValid(email)) {
                this.email = email;
            }
        }


    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */


        public boolean isEmailValid(String email) {

            // 1. Должна присутствовать @
            int indexAt = email.indexOf('@');
            // int lastAt = email.lastIndexOf('@');
            if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

            // 2. Точка после собаки
            int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
            if (dotIndexAfterAt == -1) return false;

            // Полезные методы класса Character
            // Возвращает true если символ буква
            Character.isAlphabetic('c');
            // Возвращает true если символ цифра
            Character.isDigit('1');
            Character.isLetter('3');
            Character.isLetterOrDigit('-');

            return true;
        }

    public boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявление переменных
        boolean[] result = new boolean[4]; // false, false, false, false

        String symbols = "!%$@&*()[].,-";

        // Перебираю символы
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) isDigit = true; // res[0] = true
            if (Character.isUpperCase(ch)) isUpperCase = true; // res[1] = true
            if (Character.isLowerCase(ch)) isLowerCase = true; //  res[2] = true
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
            // if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;

            // Если хотя бы в одной переменной останется значение false, то весь пароль НЕ будет признан валидным = (признан не валидным)
            return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;
        }


        return false;

    }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

/*
Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */
