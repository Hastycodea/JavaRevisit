public class PartTwoThree {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            printStars(6);
            printLines(34);
            printSpaces(2);
            printStars(5);
            printLines(34);

        }
        printStars(6);
        printLines(34);


        for(int i = 0; i < 6; i++) {
            printLines(46);
        }

    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }

    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printLines(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

}
