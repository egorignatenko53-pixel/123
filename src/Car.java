public class Car {
    String brand;
    int year;
    int speed;
    int price;
    public Car(String brand, int year, int speed, int price) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }
    public void printInfo() {
        System.out.println(this.brand + " -brand " + this.year + " -year " + this.speed + " -km/h " + this.price +" -RUB");
    }
    public boolean isFast()
        {
        return this.speed >= 150;
        }
}
