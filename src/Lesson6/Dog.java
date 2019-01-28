package Lesson6;

public class Dog extends Animal {

    private double maxLengthSwim;

    public Dog(){
        maxLength = (Math.random() * 200) + 400;
        maxHeight = (Math.random() * 1.0) + 0.5;
        maxLengthSwim = (Math.random() * 10) + 5;
    }

    public Dog(double maxLength, double maxHeight, double maxLengthSwim){
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.maxLengthSwim = maxLengthSwim;

    }

    @Override
    public void run(double length) {
        System.out.println("run: " + (maxLength >= length));
    }

    @Override
    public void swim(double length) {
        System.out.println("swim: " + (maxLengthSwim >= length));
    }

    @Override
    public void jump(double height) {
        System.out.println("jump: " + (maxHeight >= height));
    }
}
