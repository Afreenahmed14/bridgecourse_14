package day5;
public class BeautyCareDemo {
    public static void main(String[] args) {
        // Makeup object
        Makeup lipstick = new Makeup("Maybelline", "Lipstick", "Red", 499.0, true);
        lipstick.apply();
        lipstick.blend();
        lipstick.remove();

        System.out.println();

        // SkinCareProduct object
        SkinCareProduct moisturizer = new SkinCareProduct(
            "HydraGlow Moisturizer",
            "Dry",
            "Aloe Vera, Vitamin E",
            "2025-12-31",
            "twice a day"
        );
        moisturizer.applyToSkin();
        moisturizer.readInstructions();
        moisturizer.checkExpiry();

        System.out.println();

        // Dress object
        Dress partyDress = new Dress("Black", "M", "Silk", "Party", "Zara");
        partyDress.wear();
        partyDress.wash();
        partyDress.iron();
    }
}

// Makeup class
class Makeup {
    String brand;
    String type;
    String shade;
    double price;
    boolean isWaterproof;

    public Makeup(String brand, String type, String shade, double price, boolean isWaterproof) {
        this.brand = brand;
        this.type = type;
        this.shade = shade;
        this.price = price;
        this.isWaterproof = isWaterproof;
    }

    void apply() {
        System.out.println("Applying " + type + " in shade " + shade);
    }

    void remove() {
        System.out.println("Removing " + type);
    }

    void blend() {
        System.out.println("Blending the " + type);
    }
}

// SkinCareProduct class
class SkinCareProduct {
    String productName;
    String skinType;
    String ingredients;
    String expiryDate;
    String usageFrequency;

    public SkinCareProduct(String productName, String skinType, String ingredients, String expiryDate, String usageFrequency) {
        this.productName = productName;
        this.skinType = skinType;
        this.ingredients = ingredients;
        this.expiryDate = expiryDate;
        this.usageFrequency = usageFrequency;
    }

    void applyToSkin() {
        System.out.println("Applying " + productName + " for " + skinType + " skin.");
    }

    void checkExpiry() {
        System.out.println(productName + " expires on " + expiryDate);
    }

    void readInstructions() {
        System.out.println("Use " + productName + " " + usageFrequency);
    }
}

// Dress class
class Dress {
    String color;
    String size;
    String fabric;
    String style;
    String brand;

    public Dress(String color, String size, String fabric, String style, String brand) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.style = style;
        this.brand = brand;
    }

    void wear() {
        System.out.println("Wearing a " + style + " dress in " + color + " color.");
    }

    void wash() {
        System.out.println("Washing the " + fabric + " dress.");
    }

    void iron() {
        System.out.println("Ironing the dress.");
    }
}
