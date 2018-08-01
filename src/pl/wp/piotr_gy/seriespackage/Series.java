package pl.wp.piotr_gy.seriespackage;

//section 13, lecture 122 - Packages Challenge

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
            //System.out.println(sum);
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0) return 0;
        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
            //System.out.println(factorial);
        }
        return factorial;
    }

    public static int fibonacci(int n) {
        int fn1 = 1;
        int fn2 = 0;
        if(n < 1) return fn2;
        if(n < 2) return fn1;

        int fib = 0;
        for (int i = 2; i <= n ; i++) {
            fib = fn1 + fn2;
            //System.out.println(fib);
            fn2 = fn1;
            fn1 = fib;
        }
        return fib;
    }
}
