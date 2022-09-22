package Patterns;

class SolidRectangle {
    public static void main(String[] args) {
        int r = 0;
        int c = 0;

        for (r = 0; r < 4; r++) {
            for (c = 0; c < 5; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
