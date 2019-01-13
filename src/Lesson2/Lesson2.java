package Lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

        int[] firstArray = new int[]{1,0,1,0,1,1,1,1};



        changeArr(firstArray);

    }

    // Задание №1
    public static void changeArr(int[] b)
    {
        // Вывод искодного массива:
        System.out.print("Исходный массив:  ");
        System.out.println(Arrays.toString(b));

        //С помощью цикла и условия заменим 0 на 1, 1 на 0
        for (int i = 0; i < b.length; i++)
        {
            if (b[i] == 1) {b[i] = 0;}
            else {b[i] = 1;}
        }

        // Вывод результата
        System.out.print("Результат работы: ");
        System.out.println(Arrays.toString(b));
        System.out.println("");
    }
}
