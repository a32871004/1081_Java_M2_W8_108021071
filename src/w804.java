import java.util.Scanner;

public class w804 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        for(int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
}
