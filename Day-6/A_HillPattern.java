public class A_HillPattern {
    public static void main(String[] args) {
        int stars = 1;
        int height = 5;
        int space = height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = space; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            stars += 2;
            System.out.println();
        }
    }
}
