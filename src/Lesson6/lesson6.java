package Lesson6;

public class lesson6 {
    public static void main(String[] args) {

        System.out.println("Собаки: ");
        Dog dog = new Dog();
        Dog dog1 = new Dog(100,1,10);

        dog.run(100);
        dog.swim(5);
        dog.jump(1);
        dog1.run(101);
        dog1.swim(5);
        dog1.jump(0.5);

        System.out.println();
        System.out.println("Коты: ");
        Cat cat = new Cat();
        Cat cat1 = new Cat(100,2);

        cat.run(105);
        cat.jump(2);
        cat1.run(90);
        cat1.jump(1);
        cat1.swim(100);

    }
}
