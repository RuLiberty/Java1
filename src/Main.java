public class Main {

    public static void main(String[] args) {

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

        boolean bool = true; // инициализация Boolean

        int aq = 5;

        int bq = 10;

        System.out.println(FirstMetod(a,b,c,d));

        // проверка работы метода
        System.out.println(isDot(a,b)); // 32508 не входит в диапазон (false)
        System.out.println(isDot(aq,bq)); // 15 входит в диапазон (true)
        System.out.println(isDot(aq,aq)); // 10 входит в диапозон (true)

        myOut(a); // положительное число
        myOut(otrA); // отрицательное число
        myOut(zero); // ноль




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
        if ((с >= 10) & (с <= 20)) {
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
}
