package ClassWork;

public class PatternFn {
    public static int patternlv(int i,int j,int mid, int n)
    {
        if(i<n) {	
            if(j<n) {
                if((i==j && i<=mid)||(i==mid && j>=mid)) {
                    System.out.print("* ");
                }
                else if(i>mid && j==mid+2-i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                return patternlv(i,++j,mid,n);
            }
            System.out.println();
            return patternlv(++i,0,mid,n);
        }
        return n;
    }
    public static void main(String[] args) {
        int n=5;
        int mid=n/2;
        int i=0;
        int j=0; 
        patternlv(i,j,mid,n);
    }
}