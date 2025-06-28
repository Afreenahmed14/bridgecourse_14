public class trace {

   // Function A
    public static void A() {
        System.out.println("Inside A()");
        int value = B();       // A calls B and gets value
        C(value);              // A calls C using value from B
    }

    // Function B
    public static int B() {
        System.out.println("Inside B()");
        int result = 5 * 2;    // Just a sample calculation
        return result;         // Return value to A
    }

    // Function C
    public static void C(int result) {
        System.out.println("Inside C()");
        System.out.println("Final Result: " + result);
    }

    public static void main(String[] args) {
        A(); // Start execution
    }
}
