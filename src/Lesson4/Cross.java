package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    static int SIZE_X = 3;
    static int SIZE_Y = 3;

    static int blockX;
    static int blockY;

    static char[][] field = new char[SIZE_X][SIZE_Y];

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static char PLAYER_DOT = 'X';
    ;
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < SIZE_Y; i++) {
            if (i == 0) {
                System.out.print("   " + (i + 1) + "  ");
            } else {
                System.out.print((i + 1) + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + " |");
            }
            System.out.println();
        }
    }

    static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    /* Ход игрока */
    static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    /* Ход компьютера */
    static void aiStep() {
        int x;
        int y;
        System.out.println("Ходит компьютер");
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);

        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    /* Проверка возможности установки поля
     * @param y - координата по y
     * @param x - координата по x
     */
    static boolean isCellValid(int y, int x) {
        if (x < 0 || x >= SIZE_X || y < 0 || y >= SIZE_Y) {
            return false;
        }
        return (field[y][x] == EMPTY_DOT);
    }

    static boolean checkwin(char sym) {
        //region Проверка
        int flagDiag = 0;

     /*   | X   X   X  -->   |
          | X   X   X  -->   |
          | X   X   X  -->   |   Right
     */
        for (int i = 0; i < SIZE_X; i++) {
            int k = 0;
            for (int j = 0; j < SIZE_Y; j++) {
                if (field[i][j] == sym) {
                    k++;
                    if(k == 3) {return true;}
                };
            }
        }

     /*   | X   X   X  |   |
          | X   X   X  |   |
          | X   X   X  V   |    DOWN
     */

        for (int i = 0; i < SIZE_X; i++) {
            int k = 0;
            for (int j = 0; j < SIZE_Y; j++) {
                if (field[j][i] == sym) {
                    k++;
                    if(k == 3) {return true;}
                };
            }
        }


     /*   | X     X  |
          |    X     |
          | X     X  | Diagonals
     */


     // Main Diagonal
        for (int i = 0; i < SIZE_Y; i++) {
            if (field[i][i] == sym) {
                flagDiag++;
                if(flagDiag == 3) {return true;}
            };
        }
        flagDiag = 0;

     // Side diagonal
        for (int i = 0; i < SIZE_Y; i++) {
            if (field[i][2-i] == sym) {
                flagDiag++;
                if(flagDiag == 3) {return true;}
            };
        }
        flagDiag = 0;

        //endregion
        return false;
    }

    static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        initField();
        printField();

        while(true){
            playerStep();
            printField();
            if(checkwin(PLAYER_DOT)){
                System.out.println("Игрок выйграл");
                break;
            }
            if(isFieldFull()){
                System.out.println("Игра закончена! Ничья!");
                break;
            }
            aiStep();
            printField();
            if (checkwin(AI_DOT)) {
                System.out.println("Компьютер победил");
                break;
            }
            if(isFieldFull()){
                System.out.println("Игра закончена! Ничья!");
                break;
            }
        }

    }
}
