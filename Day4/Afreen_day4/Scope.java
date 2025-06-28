public class Scope {
    static String globalMessage = "I am global!"; 
    static void displayMessages() {
        String localMessage = "I am local!"; 
        System.out.println(globalMessage);   
        System.out.println(localMessage);    
    }
    public static void main(String[] args) {
        displayMessages();                   

        System.out.println(globalMessage);   
    }
}
