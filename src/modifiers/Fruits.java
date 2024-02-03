package modifiers;

// private
// 1. we can't directly access the members if they are private out-side of the class
// 2. we have the access to change the values of object with in the same class


// class
// encapsulation = hiding data + abstraction
public class Fruits {
    private String name;
    private String color;
    private int price;
    private int lifeSpan;
    public Fruits(String name, String color, int price, int lifeSpan) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.lifeSpan = lifeSpan;
    }
    // getters and setters


    //setter
    public  void setPrice(int price){
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }

    // getter
    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    // modifier static/non-static return-type name(){
    // }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
