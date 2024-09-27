package homework06;

import java.util.Random;

public class task2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums;
        nums = new int[4];
        int max = nums[0];
        System.out.println("Массив случайных чисел от 0 до 100:");
        for (int i = 0; i < 4; i++) {
            nums[i] = random.nextInt(100);
            System.out.println(+nums[i]);
        }

        for (int k = 0; k < 4; k++) {
            if (nums[k] > max) {
                max = nums[k];
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
