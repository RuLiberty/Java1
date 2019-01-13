package Lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] firstArray = {1, 0, 1, 0, 1, 1, 1, 1};
        int[] secondArray = new int[8];
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        changeArr(firstArray);
        autoFill(secondArray);
        multiplyOnTwo(thirdArray);

    }

    // Задание №1 ----> С помощью цикла и условия заменить 0 на 1, 1 на 0 <----
    public static void changeArr(int[] b) {
        // Вывод искодного массива:
        System.out.print("Исходный массив:  ");
        System.out.println(Arrays.toString(b));

        //С помощью цикла и условия заменим 0 на 1, 1 на 0
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1) {
                b[i] = 0;
            } else {
                b[i] = 1;
            }
        }

        // Вывод результата
        System.out.print("Результат работы: ");
        System.out.println(Arrays.toString(b));
        System.out.println("");
    }

    // Задание №2 ----> С помощью цикла заполнить массив размеров 8 значениями: 0 3 6 9 12 15 18 21 <----
    public static void autoFill(int[] xThree) {
        for (int i = 0; i < xThree.length; i++) {
            xThree[i] = i * 3;
        }
        System.out.println(Arrays.toString(xThree));
    }

    // Задание №3 ----> Задать массив и пройти по нему циклом, и числа меньшие 6 умножить на 2 <---- //
    public static void multiplyOnTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {if (arr[i] < 6) {arr[i] *= 2;}}
        System.out.println(Arrays.toString(arr));
    }
}
