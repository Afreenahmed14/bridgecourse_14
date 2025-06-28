public class square {

    public static int calculateSquare(int number) {
        return number * number;
    }
    public static void main(String[] args) {
        int result = calculateSquare(6);
        System.out.println("Square (stored in variable): " + result);
        System.out.println("Square (printed directly): " + calculateSquare(12));
    }
}

    
