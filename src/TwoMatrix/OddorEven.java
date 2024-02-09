package TwoMatrix;

public class OddorEven {
    public static void main(String[] args) {
        int a[]={11,8,23,21,12,4,5,7,23,12};  
        System.out.println("Odd Numbers:");
        for(int i=0;i<a.length;i++){  
            if(a[i]%2!=0){  
                System.out.println("  " +a[i]);  
            }  
        }  

            System.out.println("Even Numbers:");
            for(int i=0;i<a.length;i++){  
                if(a[i]%2==0){  
                    System.out.println("  " +a[i]);

                }
            }
    }
    
    }