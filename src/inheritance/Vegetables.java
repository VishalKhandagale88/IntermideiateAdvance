package inheritance;


public class Vegetables {
    private String name;
    private String color;
    private  int price;
    private  int lifespan;

    public Vegetables() {
    }

    final public int vegetablesQuality(int quality){
        return quality;
    }
    public Vegetables(String name, String color, int price, int lifespan) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", lifespan=" + lifespan +
                '}';
    }
    // public method in class (inheritance concept)
    public String isExpired(int days){
        if (days>5){
            return "Garbage";
        }else {
            return "cut and throw";
        }
    }

    private String boil(){
        if (color.equals("green")){
            System.out.println("Boil first");
        }
        return  "No need to boil";
    }

}
