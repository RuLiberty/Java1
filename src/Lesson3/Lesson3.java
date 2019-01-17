package Lesson3;

import java.util.Scanner;

// Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
// "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
// "pineapple", "pumpkin", "potato"};
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//        apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно, можно пользоваться:
// String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово
//Используем только маленькие буквы

public class Lesson3 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot","cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"}; // размер 25
        startGame(words);
        }

        // стартуем игру
        public static void startGame(String[] dict) {
        String ans; // ответ пользователя
        String que; // загаданное компьютером слово
        int n = 1; // количество попыток
        int flag = 0;
        char[] p = {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}; // подсказка
        que = dict[(int) (dict.length * Math.random())];   // загадываем слово
            System.out.println("Попробуй отгадать слово которое я загадал! :)");
            Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введи свой вариант: ");
            ans = sc.nextLine().toLowerCase();
            if (que.equals(ans))
            {
                System.out.println("Молодец! ты угадал загаданное мною слово: " + que + " с " + n + " попытки");
            } else {
                for (int i = 0; i < ans.length(); i++) {
                    p[i] = (que.charAt(i) == ans.charAt(i)) ? que.charAt(i) : '*';
                    flag++;
                }
                for (int i = flag; i < 15 ; i++) {
                    p[i] = '*';
                }
                System.out.println(p);
                System.out.println("Попробуй снова!");
                System.out.println();
            }
            n++;
        } while (!(que.equals(ans))); // выполняем пока выполняется условия
          sc.close();
    }

}
