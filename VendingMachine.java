import java.util.LinkedList;

public interface VendingMachine {
    public void putHotProduct(LinkedList<HotDrink> item);

    public HotDrink getHotProduct();

    public HotDrink getHotProduct(String a, int b, int c);

}
