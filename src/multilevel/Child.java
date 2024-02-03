package multilevel;

public class Child extends Parent{
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Child(String name, int age, String name1, int age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
    }

    public Child(String name, int age, String name1, int age1, String name2, int age2) {
        super(name, age, name1, age1);
        this.name = name2;
        this.age = age2;
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
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
