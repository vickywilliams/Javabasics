package Pattern;

import java.util.Scanner;

public class pattenDim {
        public static void main(String[] args){
            try (Scanner sc = new Scanner(System.in)) {
              System.out.println("Enter col @ row : ");
              int n=sc.nextInt(); 
              System.out.print("Enter Symbol : ");
 
              char c = sc.next().charAt(0);
              int i=1;
              int j; 
              do {
              j=1;
                do  {
                  System.out.print(" ");
                } 
                while(++j<=n-i+1); 
                j=1;
                do  {
                  System.out.print(c);
                }

                while(++j<=i*5-1);
                 System.out.println();
  } 
                while(++i<=n); 
              i=n-1; 
              do {
                  j=1;
                  do  {
                      System.out.print(" ");
                      }
                    while(++j<=n-i+1); 
                    j=1;
                    do
                  {
                    System.out.print(c);
 
                  }                 
                   while(++j<=i*5-1); 
 
                      System.out.println(); 
 
                  }                   while(--i>0);
            }

            }
        }
    