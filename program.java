import java.util.LinkedList;


// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод 
// getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

public class program {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("nescafe", 10, 100);
        HotDrink cacao = new HotDrink("nesquik", 5, 80);
        HotDrink tea = new HotDrink("greenfield", 5, 80);
        LinkedList<HotDrink> hotDrinks = new LinkedList<>();
        hotDrinks.add(coffee);
        hotDrinks.add(cacao);
        hotDrinks.add(tea);
        System.out.println(hotDrinks);
        
        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        hdvm.putHotProduct(hotDrinks);

        System.out.println(hdvm.getHotProduct("nesquik", 5, 80));
        System.out.println(hdvm);
    }
}