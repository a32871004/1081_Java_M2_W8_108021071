import java.util.Scanner;

public class w805 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a =sn.nextInt();
        int sum=0,cd;
        boolean flag=true;
        for (int i=2;i<=a;i++){
            cd=i;
            for (;cd!=1;){
                if (cd%2==0){
                    cd/=2;
                }
                else if(cd%3==0){
                    cd/=3;
                }
                else if (cd%5==0){
                    cd/=5;
                }
                else {
                    flag=false;
                    break;
                }
            }
            if(flag)sum+=i;
            flag=true;
        }
        System.out.println(sum);
    }
}
