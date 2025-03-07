package dsjava;
import java.util.Scanner;

public class search {
    // Static variables to store time measurements accessible from all methods
    public static long lineartime;
    public static long binarytime;
    
    public static int liner(int arr[], int target) {
        long startTime1 = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                long endTime1 = System.nanoTime();
                lineartime = endTime1 - startTime1;
                return i;
            }
        }
        long endTime1 = System.nanoTime();
        lineartime = endTime1 - startTime1;
        return -1;
    }
    
    public static int binary(int[] arr, int target) {
        long startTime = System.nanoTime();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                long endTime = System.nanoTime();
                binarytime = endTime - startTime;
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        long endTime = System.nanoTime();
        binarytime = endTime - startTime;
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter 1st elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.err.println("next element: ");
        }
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        
        int linearResult = liner(arr, target);
        if (linearResult != -1) {
            System.out.println("Element found at index: " + linearResult);
            System.out.println("Time taken by linear search: " + lineartime);
        } else {
            System.out.println("Element not found using linear search");
            System.out.println("Time taken by linear search: " + lineartime);
        }
        
        int binaryResult = binary(arr, target);
        if (binaryResult != -1) {
            System.out.println("Element found at index: " + binaryResult);
            System.out.println("Time taken by binary search: " + binarytime);
        } else {
            System.out.println("Element not found using binary search");
            System.out.println("Time taken by binary search: " + binarytime);
        }
        
        sc.close();
    }
}