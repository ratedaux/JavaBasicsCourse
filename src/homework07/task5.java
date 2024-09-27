package homework07;

import java.util.Random;

public class task5 {

    public static void main(String[] args) {

        Random rand = new Random();
        int mark = rand.nextInt(13);
        int tvTime = 45;
        System.out.println("Оценка: " + mark);
        switch (mark) {
            case 10:
            case 11:
            case 12:
                System.out.println("Как же я рада!");
                tvTime += 60;
                break;
            case 7:
            case 8:
                case9:
                System.out.println("Ты такой молодец!");
                tvTime += 45;
                break;
            case 4:
            case 5:
                case6:
                System.out.println("Ясно.");
                tvTime += 15;
                break;
            case 3:
                System.out.println("Какая досада.");
                tvTime -= 30;
                break;
            case 0:
            case 1:
            case 2:
                System.out.println("Никакого телевизора на сегодня");
                tvTime = 0;
            default:
                System.out.println("Ошибка!");
        }
        if (tvTime > 60) tvTime = 60;
        System.out.println("Оставшееся время для просмотра телевизора: " + tvTime);
    }
}
