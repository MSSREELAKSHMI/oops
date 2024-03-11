import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string to be sorted: ");
        String str = scanner.nextLine(); 
       
        char[] charArray = str.toCharArray(); 
        
        Arrays.sort(charArray);
        String sortedStr = new String(charArray); 
        System.out.println("Original string: " + str);
        System.out.println("Sorted string: " + sortedStr);
        
        scanner.close(); 
}
}

