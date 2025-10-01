//Здесь принцип DRY.
//Использование методов для устранения дублирования кода
class OrderService {
    public void createOrder(String productName, int quantity, double price) {
        processOrder("created", productName, quantity, price);
    }
    public void updateOrder(String productName, int quantity, double price) {
        processOrder("updated", productName, quantity, price);
    }
    private void processOrder(String action, String productName, int quantity, double price) {
        double totalPrice = quantity * price;
        System.out.println("Order for " + productName + " " + action + ". Total: " + totalPrice);
    }
}

//Использование общих базовых классов
abstract class Vehicle {
    String type;
    public void start() {
        System.out.println(type + " is starting");
    }
    public void stop() {
        System.out.println(type + " is stopping");
    }
}
class Car extends Vehicle {
    public Car() {
        this.type = "Car";
    }
}
class Truck extends Vehicle {
    public Truck() {
        this.type = "Truck";
    }
}

