package polymorphism.methodoverridding;

public class Child extends Parent{
    public Child(int bankBalance, String property, String marriage) {
        super(bankBalance, property, marriage);
    }
    public String marriage(){
        return "the girl i like";
    }
    @Override
    public String toString() {
        return "ChildClass{}";
    }
}
