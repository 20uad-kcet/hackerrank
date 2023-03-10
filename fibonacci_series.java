import java.io.*;
import java.util.*;

public class Solution {
    public static void fibo(int n){
        int a=0;
        int b=1;
        if(n==1){
            System.out.print(a);
        }
        if(n==2){
            System.out.print(a+" "+b);
        }
        else{
            System.out.print(a+" "+b+" ");
            for(int i=1;i<=(n-2);i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        fibo(n);
    }
}
