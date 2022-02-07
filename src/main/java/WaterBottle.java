public class WaterBottle {

    private int volume;
    private int capacity = 100;

    public WaterBottle() {
        this.volume = capacity;
    }


    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = capacity;
    }
}
