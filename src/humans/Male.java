package humans;

public class Male {
    String gender;
    String name;

    public Male(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Male{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
