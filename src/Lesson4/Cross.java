package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    static int SIZE_X = 3;
    static int SIZE_Y = 3;

    static char[][] field = new char[SIZE_X][SIZE_Y];

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static char PLAYER_DOT = 'X';;
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    static void initField(){
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    static void printField(){
        for (int i = 0; i < SIZE_Y; i++) {
                if (i == 0){
                    System.out.print(" " + (i + i) + " ");
            } else {
                    System.out.println((i + i) + " ");
                }
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print((i + i) + " |");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + " |");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        initField();
        printField();

    }
}
