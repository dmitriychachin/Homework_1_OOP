public class ProteinBar extends Product {

    private int size;

    public ProteinBar(String name, double price, double value) {
        super(name, price, value);
        size = 80;
    }
    
    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return String.format("Батончик : %s" ,super.toString());
    }
}
