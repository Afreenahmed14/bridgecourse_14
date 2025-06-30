package day5;
public class PetDog {
    String name;
    String breed;
    int age;
    public PetDog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
    public static void main(String[] args) {
        // Create two PetDog objects
        PetDog dog1 = new PetDog("Buddy", "Golden Retriever", 5);
        PetDog dog2 = new PetDog("Lucy", "Poodle", 2);

        // Call bark() method and print name and age
        dog1.bark();
        System.out.println("Name: " + dog1.name + ", Age: " + dog1.age);

        dog2.bark();
        System.out.println("Name: " + dog2.name + ", Age: " + dog2.age);
    }
}

