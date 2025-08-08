public class D48Q25 {
    public static void main(String[] args) {
        double a = 12.3;
        double b = 4.5;
        D48Q25 o = new D48Q25();
        int c = o.number(a, b);
        System.out.println(c);
    }

    int number(double v1, double v2) {
        return (int)(v1 / v2);
    }
}
