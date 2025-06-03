public class D49Q20kadai {
    public static void main(String[] args) {
        double[][] arr = new double[5][10];

        for (double[] y : arr) {
            for (double x : y) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
