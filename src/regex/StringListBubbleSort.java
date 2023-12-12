package regex;

public class StringListBubbleSort {
    public static void main(String[] args) {
        // Create a list of strings
        String[] stringArray = {"Banana", "Apple", "Orange", "Grapes"};

        // Sort the array using bubble sort
        bubbleSort(stringArray);

        // Print the sorted array
        System.out.print("Sorted String Array: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            // Continue the loop until no more swaps are needed
        } while (swapped);
    }

    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}