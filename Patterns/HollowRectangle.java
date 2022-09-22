package Patterns;

class HollowRectangle {
    public static void main(String[] args) {
        int rn = 4;
        int cn = 5;

        for (int r = 0; r < rn; r++) {
            for (int c = 0; c < cn; c++) {
                if (r == 0 || r == rn - 1 || c == 0 || c == cn - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}