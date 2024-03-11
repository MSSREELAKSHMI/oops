import java.util.Arrays;
import java.util.Scanner;

public class UserStringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 
       
        String[] array1 = new String[size];
       
        
        
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextLine();
        }
        
       
        
        
        Arrays.sort(array1);
        
        
       
        System.out.println("Sorted array1: " + Arrays.toString(array1));
       
        
        scanner.close();
    }
}


