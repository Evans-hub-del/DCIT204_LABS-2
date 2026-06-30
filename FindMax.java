import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        
        int[] numbers = new int[size];
        
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }
        
        
        if (size == 0) {
            System.out.println("\nThe array is empty.");
            scanner.close();
            return;
        }
        
        
        int maxVal = numbers[0];
        int maxIndex = 0;
        
        for (int i = 1; i < size; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
                maxIndex = i;
            }
        }
        
        
        System.out.println("\n-----------------------------------");
        System.out.println(" RESULTS:");
        System.out.println("-----------------------------------");
        System.out.println("Maximum Value : " + maxVal);
        System.out.println("Found at Index: " + maxIndex);
        System.out.println("-----------------------------------");
        
        scanner.close();
    }
}
