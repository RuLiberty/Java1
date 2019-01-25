package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean richness;

    public Cat(){
        name = "Murzik";
        appetite = (int) (Math.random() * 50);
        richness = false;
    }

    public Cat(String name){
        this.name = name;
        appetite = (int) (Math.random() * 50);
        richness = false;
    }

    public Cat(String name, int appetite) {
        this(name);
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        richness = p.decreaseFood(appetite);
    }

    public void getRichness(){
        System.out.println("richness: " + richness);
    }
}
