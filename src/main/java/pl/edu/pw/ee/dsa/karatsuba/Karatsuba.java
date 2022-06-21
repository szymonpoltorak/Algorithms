package pl.edu.pw.ee.dsa.karatsuba;

public class Karatsuba {
    private Karatsuba(){}
    public static long karatsuba(long x, long y){
        if (x < 10 || y < 10){
            return x * y;
        }
        long half = Karatsuba.countHalf(x, y);

        long a = Karatsuba.countDivide(x, half);
        long b = Karatsuba.countModulo(x, half);
        long c = Karatsuba.countDivide(y, half);
        long d = Karatsuba.countModulo(y, half);

        long ac = karatsuba(a, c);
        long bd = karatsuba(b, d);
        long added = karatsuba(a+b, c+d) - ac - bd;

        return Karatsuba.countPowers(ac, 2*half) + Karatsuba.countPowers(added, half) + bd;
    }

    public static long countHalf(long x, long y){
        if (x == 0 || y == 0){
            throw new IllegalArgumentException("LOG NUMBER CANNOT BE 0!!");
        }
        return (long) (Math.max(1+Math.log10(x), 1+Math.log10(y)) / 2);
    }

    public static long countDivide(long k, long n){
        return (long) (k / Math.pow(10, n));
    }

    public static long countModulo(long k, long n){
        return (long) (k % Math.pow(10, n));
    }

    public static long countPowers(long k, long n){
        return (long) (k * Math.pow(10, n));
    }
}
