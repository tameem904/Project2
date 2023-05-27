package project02;
public abstract class Car {
     double carPrice;
     String color;
     public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    public double calculateSalePrice() {
        return carPrice;
    }
}
 class Sedan extends Car{
    double length;
    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }
    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.05;
        } else {
            return carPrice * 0.10;
        }
    }
}
 class Truck extends Car {
     double weight;
    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.10;
        }else{
            return carPrice * 0.20;
        }
    }
}
class CarTester {
    public static void main(String[] args) {

        Car c1[] = {new Truck(32000, "black", 500), new Sedan(23000, "blue", 2300)};
        for(Car c2:c1){
            double result=c2.calculateSalePrice();
            System.out.println(result);
        }

    }
}