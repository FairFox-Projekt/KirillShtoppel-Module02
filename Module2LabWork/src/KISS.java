//Здесь принцип KISS
//Избегание чрезмерного использования абстракций
class Calculator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

//Избегание избыточного использования шаблонов проектирования
class RedoneSingleton {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
class Client {
    public void execute() {
        RedoneSingleton service = new RedoneSingleton();
        service.doSomething();
    }
}
