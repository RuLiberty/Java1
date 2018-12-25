// задание 1
public class Main {

    public static void main(String[] args) {

        // задание 2
        byte a = 8; // инициализация byte
        byte otrA = -8; // инициализация отрицательного byte
        byte zero = 0;
        short b = 32500; // инициализация short
        int c = 256548475; // инициализация int
        long d = 1234567891011121314L; // инициализация long

        float e = 150.2f; // инициализация float
        double f = 15.214584; // инициализация double

        char g = 'A'; // инициализация char
        String h = "Hello World"; // инициализация String
        String myName = "Дмитрий";

        boolean bool = true; // инициализация Boolean

        int aq = 5;

        int bq = 10;

        // задание 3
        System.out.println(FirstMetod(a,b,c,d));

        // задание 4. проверка работы метода
        System.out.println(isDot(a,b)); // 32508 не входит в диапазон (false)
        System.out.println(isDot(aq,bq)); // 15 входит в диапазон (true)
        System.out.println(isDot(aq,aq)); // 10 входит в диапозон (true)

        // задание 5
        myOut(a); // положительное число
        myOut(otrA); // отрицательное число
        myOut(zero); // ноль

        // задание 6
        System.out.println(isNegative(a)); // false
        System.out.println(isNegative(otrA)); // true

        // задание 7
        Hello(myName);

        // задание 8
        visocos(1943); // не вискосный
        visocos(1904); // високосный
        visocos(1900); // не вискосный
        visocos(2000); // високосный
        visocos(1868); // високосный
    }

    // метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
    public static int FirstMetod (byte a, short b, int c, long d)
    {
        return (int) (a * (b + (c / d)));
    }

    // метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean isDot(int a, int b)
    {
        boolean p = false;
        int с = a + b;
        if ((с >= 10) && (с <= 20)) {
            p = true;
        }
        return p;
    }

    /* метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.
     */
    public static void myOut (int a) {
        if (a < 0)
        {
            System.out.println(a + " - Это отрицательное число");
        } else {
            System.out.println(a + " - Это или положительное число или 0");
        }
    }

    // метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    // метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void Hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static void visocos(int year) {
        if (((year%400) == 0) || ((((year%100) != 0)) && (((year%4) == 0)))) {
            System.out.println(year + " - этот год високосный");
        }
        else {
            System.out.println(year + " - этот год НЕ високосный");
        }
    }
}
