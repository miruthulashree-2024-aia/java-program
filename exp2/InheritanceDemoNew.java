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
        
        System.out.println("Single Inheritance Example :");
        KitchenAppliance kitchenApp = new KitchenAppliance();
        kitchenApp.plugIn();   
        kitchenApp.function(); 

        
        System.out.println("\nMultilevel Inheritance Example :");
        Blender blender = new Blender();
        blender.plugIn();  
        blender.function(); 
        blender.blend();   
    }
}

