import java.util.Arrays;

public class DataStructuresII {
   
   public static void toPower(int size, int power){
        int[] toPowerArray = new int[size];

        for (int i = 0; i < size; i++) {
            toPowerArray[i] = 1;
            for (int j = 1; j <= power; j++) {
                toPowerArray[i] *= i;
                System.out.println(toPowerArray[i]);
            }
            
        }

        System.out.println(Arrays.toString(toPowerArray));
   }

   public static void main(String[] args) {
       toPower(5,4);
   }

}