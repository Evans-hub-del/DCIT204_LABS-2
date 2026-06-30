import java.util.Scanner;

public class PairSum {
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
        
       
        System.out.print("Enter the Target Sum to search for: ");
        int targetSum = scanner.nextInt();
        
        // 4. Brute Force Search (Nested Loops)
        boolean pairFound = false;
        
        System.out.println("\n-----------------------------------");
        System.out.println("🔍 SEARCHING FOR PAIR...");
        System.out.println("-----------------------------------");
        
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    
                    System.out.println("Pair Found!");
                    System.out.println("Index 1  : " + i + " (Value: " + numbers[i] + ")");
                    System.out.println("Index 2  : " + j + " (Value: " + numbers[j] + ")");
                    System.out.println("Equation : " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    pairFound = true;
                    
                    
                    break; 
                }
            }
            if (pairFound) break; 
        }
        
        
        if (!pairFound) {
            System.out.println("No unique pair found in the array that sums up to " + targetSum + ".");
        }
        System.out.println("-----------------------------------");
        
        scanner.close();
    }
}