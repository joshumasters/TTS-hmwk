import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CarDeal {
    Scanner input = new Scanner(System.in);

    String desiredModel;
    String desiredMake;
    boolean haveModel = false;

    HashMap<String, String> ourCars = new HashMap<String, String>();

    // <Model, Make>
    public void run() {
        ourCars.put("Civic", "Honda");
        ourCars.put("Accord", "Honda");
        ourCars.put("Focus", "Ford");
        ourCars.put("Fusion", "Ford");
        ourCars.put("F-150", "Ford");
        ourCars.put("Camry", "Toyota");
        ourCars.put("Corolla", "Toyota");

        System.out.println("What model of car are you looking for?");
        desiredModel = input.nextLine();
        System.out.println("Oh, you're looking for a " + desiredModel + "?");

        for (Map.Entry<String, String> entry: ourCars.entrySet()) {
            if(desiredModel.equals(entry.getKey())) {
                haveModel = true;
                desiredMake = entry.getValue();
            }
        }
        if(haveModel == true){
            System.out.println("We have several " + desiredMake + "s right this way");
        }else if (haveModel == false){
            System.out.println("Sorry we don't have any of those cars here.");
        }
    }
}