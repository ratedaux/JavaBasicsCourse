package lesson27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    @Test
    public void testAddition() {

        int result = 2 + 2;

        // Методы проверки утверждений
        // assertEquals(expected, actual) - проверяет, равны ли два значения
        Assertions.assertEquals(4, result); // проверяет равны ли два значения
        Assertions.assertNotEquals(5, result); // тест будет пройден если "неожидаемый результат" не совпадает с фактическим
        Assertions.assertTrue(result >= 4); // проверяет, что условие верно (условие возвращает true)
        assertFalse(result > 4); // проверяет, что условие ложно (условие возвращает false)
        assertNull(null); // Проверяет, что объект равен null
        assertNotNull("String"); // Проверяет, что объект не равен null
    }

    public void emptyTest(){
        System.out.println("Test empty");
    }

    @CsvFileSource(resources = "data.csv")
    void testCSVFileSource(String fruit, int rank, boolean flag){
        System.out.println(fruit + " | " + rank + " | " + !flag);
    }
}