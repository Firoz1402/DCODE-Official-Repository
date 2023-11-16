public class Problem_Statement_2 {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate and print the average of the array elements
        double average = calculateAverage(numbers);
        System.out.println("Average of the array elements: " + average);
    }

    // Function to calculate the average of an array of integers
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            // Handle the case where the array is empty to avoid division by zero
            System.out.println("Cannot calculate average for an empty array.");
            return 0.0;
        }

        int sum = 0;
        // Calculate the sum of array elements
        for (int num : arr) {
            sum += num;
        }

        // Calculate and return the average
        return (double) sum / arr.length;
    }
}

