import java.util.Scanner;

class Appliance {
    void plugIn() {
        System.out.println("Appliance is plugged in.");
    }
}

class KitchenAppliance extends Appliance {
    void function() {
        System.out.println("This appliance is used in the kitchen.");
    }
}

class Blender extends KitchenAppliance {
    void blend() {
        System.out.println("Blender is blending fruits.");
    }
}

public class InheritanceDemoNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an appliance:");
        System.out.println("1. Kitchen Appliance");
        System.out.println("2. Blender");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            KitchenAppliance kitchenApp = new KitchenAppliance();
            kitchenApp.plugIn();
            kitchenApp.function();
        } else if (choice == 2) {
            Blender blender = new Blender();
            blender.plugIn();
            blender.function();
            blender.blend();
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}

