public class power {
    public static int myPower(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        int base = 5;
        int exponent = 0;
        int customResult = myPower(base, exponent);
        double builtInResult = Math.pow(base, exponent);
        System.out.println("Custom Power Result: " + customResult);
        System.out.println("Built-in Math.pow Result: " + builtInResult);
    }
}
