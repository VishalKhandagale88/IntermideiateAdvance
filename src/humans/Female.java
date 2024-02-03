package humans;

public class Female {
    String gender;
    String name;

    public Female(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Female{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
