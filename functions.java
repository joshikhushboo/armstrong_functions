import java.util.Scanner;
public class functions {
    static void Functions(int n){
        int x=n;
        int rem,sum=0;
        while(n!=0){
            rem=n%10;
            sum+= Math.pow(rem,3);
            n=n/10;
        }
        if (sum==x){
            System.out.println("yes it is...");
        }
        else{
            System.out.println("no");
        }


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n:");
        int no=sc.nextInt();
        System.out.println("armostrong number");
        Functions(no);

        sc.close();
  
}
    
}
