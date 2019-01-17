package Lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] firstArray = {1, 0, 1, 0, 1, 1, 1, 1};
        int[] secondArray = new int[8];
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] itsMassiv = new int[4][4];
        int[][] itsMassivTwo = new int[6][6];
        int[] fourthArray = {4, 2, 3, 1, 5, 20, 8, 9, 6};
        int[] fifthArray = {1, 1, 1, 2, 1};
        int[] sixthArray = {2, 1, 1, 2, 1};
        int[] tenArr = {10, 10, 10, 10};
        int[] seventhArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        changeArr(firstArray);
        autoFill(secondArray);
        multiplyOnTwo(thirdArray);
        toDiagonal(itsMassiv);
        toDiagonal(itsMassivTwo);
        findMinMax(fourthArray);
        System.out.println(checkBalance(fifthArray)); // true
        System.out.println(checkBalance(sixthArray)); // false
        System.out.println(checkBalance(tenArr)); // true
        shiftElementArr(seventhArr, 2);
        seventhArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shiftElementArr(seventhArr, -3);
    }

    // Задание №1 ----> С помощью цикла и условия заменить 0 на 1, 1 на 0 <----
    public static void changeArr(int[] b) {
        // Вывод искодного массива:
        System.out.print("Исходный массив:  ");
        System.out.println(Arrays.toString(b));

        //С помощью цикла и условия заменим 0 на 1, 1 на 0
        for (int i = 0; i < b.length; i++) {
            b[i] = (b[i] == 1) ? 0 : 1;
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Задание №4 ->  Создать квадратный двумерный целочисленный массив,
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами <- //
    public static void toDiagonal(int[][] sqrArr) {
        for (int i = 0; i < sqrArr.length; i++) {
            for (int j = 0; j < sqrArr[i].length; j++) {
                if (i == j) {
                    sqrArr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < sqrArr.length; i++) {
            for (int j = 0; j < sqrArr[i].length; j++) {
                System.out.print(sqrArr[i][j]);
            }
            System.out.println();
        }
    }

    // Задание №5 ----> Задать одномерный массив и найти в нем минимальный и максимальный элементы  <---- //
    public static void findMinMax(int[] arr) {
        int min = arr[0]; // инициализируем первым элементом массива
        int max = arr[0]; // инициализируем первым элементом массива
        System.out.println("Для матрицы :" + Arrays.toString(arr));
        System.out.println("Найдем максимальный и минимальный элемент и выведем в консоль:");
        System.out.println();

        for (int a : arr)
        {
            if (a < min) {min = a;}
            if (a > max) {max = a;}
        }
        System.out.println("Максимальным элементом матрицы является: " + max);
        System.out.println("Минимальным элементом матрицы является: " + min);
    }

    // Задание №6 ----> Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
    // checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.  <----
    public static boolean checkBalance(int[] arr)
    {   boolean balance = false;
        int flag = 1;
        int fArg = 0;
        int sArg = 0;
    do {
        for (int i = 0; i < flag; i++) {fArg += arr[i];}
        for (int j = flag; j < arr.length; j++) {sArg += arr[j];}

        flag++;

        if ((fArg == sArg)) {balance = true;}
        else {
            balance = false;
            fArg = 0;
            sArg = 0;
        }
    }
    while(flag < arr.length && !balance);
    return balance;
    }

    // Задание №7 ----> Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами  <---- //
    public static void shiftElementArr(int[] arr, int pos)
    {
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        int size = arr.length;
        if (pos > 0) {
            for (int i = 0; i < pos; i++) {
                int temp = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        } else
        {
            for (int i = 0; i > pos; i--) {
                int temp = arr[0];
                for (int j = 0; j < size-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size-1] = temp;
            }
        }
        System.out.println("Результат сдвига: " + Arrays.toString(arr));
    }
    }
