package number16;

class num_16 {
    public static void reverse(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                reverse(n, 1);
            }
            else if (n == max) {
                reverse(max, ++count);
            }
            else {
                reverse(max, count);
            }
        }
        else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        reverse(0, 0);
    }
}
