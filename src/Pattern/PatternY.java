package Pattern;

public class PatternY {
    public static void main(String[] args) {
        int n = 7;
        
        int j=0;
        int  i=0;
        while(i<n)
		{
			while(j<n) {
			    if((i==j && i<=n/2) || (i+j==n-1 && i<=n/2) || (j==n/2 && i>=n/2))
				    System.out.print("* ");
			    else
				    System.out.print("  ");
			    j++;
			}
			j=0;
			System.out.println();
		i++;
    }
}
}
