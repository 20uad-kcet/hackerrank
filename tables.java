import java.util.Scanner;
public class yuki{
    static void tables(int n){
        for(int i=1;i<=10;i++){
            int m=i*n;
            System.out.println(i+"*"+n+"="+m);
        }
  }
    public static void main(String ar[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        tables(a);
    }
}
