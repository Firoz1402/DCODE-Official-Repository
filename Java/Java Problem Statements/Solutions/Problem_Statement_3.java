public class Problem_Statement_3 {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {45, 67, 12, 89, 34, 56};

        // Find and print the maximum element in the array
        int maxElement = findMaxElement(numbers);
        System.out.println("Maximum element in the array: " + maxElement);
    }

    // Function to find the maximum element in an array of integers
    public static int findMaxElement(int[] arr) {
        if (arr.length == 0) {
            // Handle the case where the array is empty
            System.out.println("Cannot find the maximum element in an empty array.");
            return Integer.MIN_VALUE; // Return a default value indicating an error
        }

        int max = arr[0]; // Assume the first element is the maximum

        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

