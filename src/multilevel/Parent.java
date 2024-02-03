package multilevel;

public class Parent extends GrandParent{
    private String name;
    private int age;
    public Parent() {
    }
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Parent(String name, int age, String name1, int age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
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
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
