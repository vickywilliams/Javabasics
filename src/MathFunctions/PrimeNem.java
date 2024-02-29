package MathFunctions;

public class PrimeNem {
    public static void findPrimeNumber(Integer[] arr) {
        for (int i : arr) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void simplestFormRatio(Integer ante, Integer cons) {
        Integer gcf = findGcf(ante, cons);

        System.out.println(gcf + " => " + Math.divideExact(ante, gcf) + ":" + Math.divideExact(cons, gcf));
    }

    public static int findGcf(int x, int y) {
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        return x;
    }
    public static void main(String[] args) {
        Integer[] num = {21,13,17,113,119};
        findPrimeNumber(num);
    }
}
