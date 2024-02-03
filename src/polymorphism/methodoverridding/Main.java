package polymorphism.methodoverridding;

public class Main {
    public static void main(String[] args) {
        Parent vishalsParent =  new Parent(1000,"land","lisa");
        String marriage = vishalsParent.marriage();
        System.out.println(marriage);
        Child vishal = new Child(1000,"home","chandana");
        String marriage1 = vishal.marriage();
        System.out.println(marriage1);
    }
}
