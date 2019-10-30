import java.util.Scanner;

public class w802 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--){ //for(int j=1;j<=n-i;j++)
                    System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
