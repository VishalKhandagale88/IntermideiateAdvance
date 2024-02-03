package hierarchical;

public class Sport {
    private String name;
    private String type; // team sport or single person

    public Sport(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Sport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
