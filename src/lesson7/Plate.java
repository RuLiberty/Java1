package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            System.out.println("В тарелке не хватает еды для того чтобы накормить кота!");
            return false;
        }
    }

    public void addFood(int food){this.food += food;}

    public void info() {
        System.out.println("plate: " + food);
    }
}
