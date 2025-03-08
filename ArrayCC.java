public class ArrayCC {

    public static void arrayOperations(int[] numbers) {
        // 1. Linear Search
        int key = 3;
        int linearSearchIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                linearSearchIndex = i;
                break;
            }
        }
        System.out.println("Linear Search: Key " + key + " found at index " + linearSearchIndex);

        // 2. Largest Number
        int largest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest Number: " + largest);

        // 3. Binary Search (assuming array is sorted)
        int binarySearchKey = 4;
        int low = 0;
        int high = numbers.length - 1;
        int binarySearchIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == binarySearchKey) {
                binarySearchIndex = mid;
                break;
            } else if (numbers[mid] < binarySearchKey) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary Search: Key " + binarySearchKey + " found at index " + binarySearchIndex);

        // 4. Reverse an Array
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }
        System.out.print("Reversed Array: ");
        for (int num : reversedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Pairs in an Array
        System.out.println("Pairs in Array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
            }
        }

        // 6. Print Subarrays
        System.out.println("Subarrays:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + (k == j ? "" : ", "));
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        arrayOperations(numbers);
    }
}