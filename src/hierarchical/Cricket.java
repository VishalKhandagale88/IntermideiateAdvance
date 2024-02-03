package hierarchical;

public class Cricket extends Sport{
    private int size ; // min area required to play

    public Cricket(String name, String type, int size) {
        super(name, type);
        this.size = size;
    }
    public Cricket(){

    }

    public Cricket(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "size=" + size +
                '}';
    }
}
