import java.util.ArrayList;

public class Part3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(8);
        numbers.add(15);
        numbers.add(16);
        numbers.add(23);
        numbers.add(2);
        numbers.add(42);

        numbers.remove(3);

        if (numbers.contains(15)) {
            System.out.println("number found!");
        } else {
            System.out.println("not on the list");
        }

        smallestNumberIndex(numbers);
        sumInList(numbers);
        printNumbers(numbers);

    }

    public static void smallestNumberIndex(ArrayList<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }

        }
        System.out.println("Index of the smallest number: " + numbers.indexOf(smallest));
    }

    public static void sumInList(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum in List: " + sum);
    }

    public static void printNumbers(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i) + ", ");

        }
        int lastNumber = numbers.get(numbers.size() - 1);
        System.out.println(lastNumber);
    }
}
