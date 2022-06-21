package pl.edu.pw.ee.dsa.karatsuba;

public class Main {
    public static void main (String[] args){
        long x = 7757632;
        long y = 9246465;

        long result = x * y;
        System.out.println("Result: " + result);

        result = Karatsuba.karatsuba(x, y);
        System.out.println("karatsuba result: " + result);
    }
}
