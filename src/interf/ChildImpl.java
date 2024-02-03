package interf;

public class ChildImpl implements Parent1,Parent2{

    @Override
    public void m1() {
        System.out.println("Hello you are learning interface");
    }

    @Override
    public void mul(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

}
