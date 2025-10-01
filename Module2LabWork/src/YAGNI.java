//Здесь принцип YAGNI.
//Избыточное создание абстракций
class Circle {
    double pi = 3.14;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return pi * radius * radius;
    }
}
class Square {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
}
