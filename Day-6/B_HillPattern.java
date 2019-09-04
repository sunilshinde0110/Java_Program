public class B_HillPattern {
    public static void main(String[] args) {
        int height = 5;

        for (int i = height; i >= 1; i--) {
            for (int j = height - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
