import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {

    ArrayList<Integer> list = new ArrayList<Integer>();

    int sum;

    int product = 1;

    int largest;


    Scanner input = new Scanner(System.in);
    
    public void run(){
        System.out.println("Choose 5 numbers! What's number 1?");
        list.add(Integer.parseInt(input.nextLine()));
        
        System.out.println("Number 2?");
        list.add(Integer.parseInt(input.nextLine()));
       
        System.out.println("Number 3?");
        list.add(Integer.parseInt(input.nextLine()));
        
        System.out.println("Number 4?");
        list.add(Integer.parseInt(input.nextLine()));
        
        System.out.println("Number 5?");
        list.add(Integer.parseInt(input.nextLine()));

        int smallest = list.get(0);

        System.out.println("Your numbers are " + list.toString());

        for (Integer list : list) {

            sum += list;
            
        }

        System.out.println("The sum of your numbers is " + sum);

        for (Integer list : list) {
            product *= list;
        }

        System.out.println("The product of your numbers is " + product);

        for (Integer list : list) {
            if (list > largest){
                largest = list;
            }
        }

        System.out.println("The largest number is " + largest);

        for (Integer list : list) {
            if (list < smallest){
                smallest = list;
            }
        }

        System.out.println("The smallest number is " + smallest);
    }




    
}