package ch1.se1;

public class ex16 {
    public static void main(String[] args) {
        System.out.print(exR1(6));
    }

    public static String exR1(int n)
    {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
