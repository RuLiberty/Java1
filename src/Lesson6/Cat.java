package Lesson6;

public class Cat extends Animal {

    public Cat(){
        maxLength = (Math.random() * 200) + 100;
        maxHeight = (Math.random() * 2) + 1;
    }

    public Cat(double maxLength, double maxHeight){
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public void run(double length) {
        System.out.println("run: " + (maxLength >= length));
    }

    @Override
    public void swim(double length) {
        System.out.println("Кот не умеет плавать!");
    }

    @Override
    public void jump(double height) {
        System.out.println("jump: " + (maxHeight >= height));
    }
}
