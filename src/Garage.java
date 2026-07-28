public class Garage {
    public static void main(String[]args) {
        Car c1 = new Car("Toyota",2021,140,150000);
        Car c2= new Car("BMW",2019,190,153450000);
        Car c3= new Car("KIA",2018,250,1234000);
        Car c4= new Car("Audi",2025,350,1212334000);
        Car c5= new Car("Honchi",2023,130,12334000);

        Car[] cars = {c1,c2,c3,c4,c5};
        for(Car c : cars) {
            c.printInfo();
            System.out.println(c.brand + "fast?"+ c.isFast());
        }

    }
}
