import java.util.Arrays;
import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine {

    private LinkedList<HotDrink> hotdrinks;

    @Override
    public void putHotProduct(LinkedList<HotDrink> item) {
        this.hotdrinks = item;
    }

    @Override
    public HotDrink getHotProduct(String a, int b, int c) {
        for (HotDrink hotDrink : hotdrinks) {
            if (hotDrink.getName().equals(a)) {
                if (hotDrink.getVolume() == b) {
                    if (hotDrink.getTemperature() == c) {
                        hotdrinks.remove(hotDrink);
                        return hotDrink;
                    }
                }
            }
        }
        return null;

    }

    @Override
    public HotDrink getHotProduct() {
        return hotdrinks.pollLast();
    }

    @Override
    public String toString() {

        return Arrays.toString(hotdrinks.toArray());
    }

}
