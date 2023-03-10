import java.io.*;
import java.util.*;

public class Solution {
    static int pow(int a,int b){
        int pow=1;
        for(int i=1;i<=b;i++){
            pow=pow*a;
        }
        return pow;
    }
    static int btod(int n){
        int base=2;
        int exp=0;
        int sum=0;
        while(n!=0){
            int k=n%10;
            int h=pow(base,exp);
            sum=sum+(h*k);
            n=n/10;
            exp++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=btod(n);
        System.out.println(result+" ");
    }
}
