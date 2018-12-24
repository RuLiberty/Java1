public class Main {

    public static void main(String[] args) {

        byte a = 8; // инициализация byte
        short b = 32500; // инициализация short
        int c = 256548475; // инициализация int
        long d = 1234567891011121314L; // инициализация long

        float e = 150.2f; // инициализация float
        double f = 15.214584; // инициализация double

        char g = 'A'; // инициализация char
        String h = "Hello World"; // инициализация String

        System.out.println(FirstMetod(a,b,c,d));

    }

    // метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
    public static int FirstMetod (byte a, short b, int c, long d)
    {
        return (int) (a * (b + (c / d)));
    }
}
