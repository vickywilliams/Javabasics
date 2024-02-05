package Pattern;

public class pattendig {
    public static void main(String[] args) {
        int s=7;
        if (s%2 !=0) {
            int x=(s/2);
            int y=(s/2);
            boolean isReverse = true;

            for (int i = 0; i < s; i++) {

                for (int j = 0; j < s; j++) {
                    if (x==j || y==j) {
                       System.out.print("*");  
                    }
                    else{
                        System.out.print(".");
                    }
                }
                if (x==0) {
                    isReverse = false;
                }
                if (isReverse) {
                    x--;
                    y++;
                }
                else{
                    x++;
                    y--;
                }
                System.out.println("");
            }
        }
        else{
             System.out.println("Please send a odd number");
        }
    }
}
