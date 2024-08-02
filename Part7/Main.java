package Part7;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6};
        int target = 4;
        int result = findFirstOccurrence(numbers, target);

        System.out.println(result);        
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;        
        }

        int start = 0, end = arr.length - 1, middle = 0;
        int result = -1;
        
        while(start <= end) {
            middle = (start + end) / 2;

            if (arr[middle] == target) {
                result = middle;
                //keep searching to the left when the result is found
                end = middle - 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return result;
    }
}
