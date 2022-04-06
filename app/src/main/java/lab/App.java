package lab;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("Test");
        RegularVector test = new RegularVector(10);
        test.write("1");
        test.write("123123123");
        System.out.println(test.read(0));
        System.out.println(test.read(1));
    }
}
