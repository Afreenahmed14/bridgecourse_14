public class greet {
    public static void customGreet(String name, String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }
    public static void customGreet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void customGreet() {
        System.out.println("Hello, Guest!");
    }
    public static void main(String[] args) {
        customGreet("Ahmed", "Good Morning");
        customGreet("Riya");
        customGreet();
    }
}

    
