package inheritance;

public class Veggies extends Vegetables{
    private String name;

    public Veggies() {
    }

    public Veggies(String name, String color, int price, int lifespan, String name1) {
        super(name, color, price, lifespan);
        this.name = name1;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veggies{" +
                "name='" + name + '\'' +
                '}';
    }
}
