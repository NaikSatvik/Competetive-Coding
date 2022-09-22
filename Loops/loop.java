package Loops;

class loop {
    public static void main(String[] args) {
        int c = 0;
        for (c = 0; c < 11; c++) {
            System.out.println(c);
        }

        int i = 0;
        // while loop (will check first and then execute the condition)
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        // do while (will execute at least one time in any case)
        do {
            System.out.println(j);
            j++;
        } while (j < 11);
    }
}