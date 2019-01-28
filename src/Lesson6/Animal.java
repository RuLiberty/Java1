package Lesson6;

public abstract class Animal {

    protected double maxLength;
    protected double maxHeight;

    protected abstract void run(double length);
    protected abstract void jump(double height);
    protected void swim(double length){
    }
}

