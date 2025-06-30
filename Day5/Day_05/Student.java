package day5;

public class Student {
    String name;
    String idNumber;
    String major;
    public Student(String name, String idNumber, String major) {
        this.name = name;
        this.idNumber = idNumber;
        this.major = major;
    }
    public String getInfo() {
        return "Name: " + name + "\nID: " + idNumber + "\nMajor: " + major + "\n";
    }

    public static void main(String[] args) {
        // Create three Student objects
        Student student1 = new Student("Afreen", "KIT005", "Computer Science");
        Student student2 = new Student("Shifa", "KIT102", "Mechanical Engineering");
        Student student3 = new Student("Spoorthi", "KIT108", "Electrical Engineering");

        // Print their info
        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
    }
}
