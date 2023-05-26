public class HotDrink extends Products {

    private int temperature;

    @Override
    public String getName() {
        return super.name;
    }

    public HotDrink(String name, int volume, int temperature) {
        super.name = name;
        super.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume + '\'' +
                ", volume=" + temperature +
                '}';
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getVolume() {
        return super.volume;
    }

    @Override
    public void setVolume(int volume) {
        super.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
