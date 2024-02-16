package Recursive;

public class OddEvev {
    public static void main(String[] args) {
        int i = 3;
        int j = 5;
        System.out.println(thala(i, j));

    }

    public static int thala(int i, int j) {
        if (i>j) {
            System.out.println("from thala1: "+i+ " " + j);
            return 0;
            
        }
        else{
            System.out.println("from thala2: "+i+ " " + j);
            return i + thala(i+1, j);
        }

        
    }
}
