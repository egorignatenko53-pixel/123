public class Car {
    private String brand;
    private int year;
    private int speed;
    private int price;
    public Car(String brand, int year, int speed, int price) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }
    public String getBrand() {
        return this.brand;
    }
    public void printInfo() {
        System.out.println(this.brand + " -brand " + this.year + " -year " + this.speed + " -km/h " + this.price +" -RUB");
    }
    public boolean isFast()
        {
        return this.speed >= 150;
        }
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Скорость не может быть отрицательной!");
        }
    }
}
