package lesson7;

public class MainClass {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik",55);
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Cat[] cats = {cat, cat1, cat2};
        Plate plate = new Plate(100);

        plate.info();
        System.out.println();

        for (Cat a:cats) {
            a.eat(plate);
            a.getRichness();
            System.out.println();
            plate.info();
        }
    }
}
