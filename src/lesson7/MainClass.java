package lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik",70);
        Cat cat1 = new Cat();
        Plate plate = new Plate(100);
        plate.info();
        plate.addFood(10);
        cat.eat(plate);
        plate.info();
        cat1.eat(plate);
        plate.info();
        cat.getRichness();
        cat1.getRichness();
    }
}
