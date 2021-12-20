public class Patterns {
    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        patterns.printStarSequence();
    }

    void printStarSequence() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            int l = 0;
            while (l < i) {
                System.out.print("  ");
                l++;
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = (2 * i - 2); j < (2 * 5 - 2); j++) {
                System.out.print(" ");// print space
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
