import java.io.*;
import java.util.*;

public class Solution {
    public static void nonPrime(int a,int b){
        for(int i=a;i<=b;i++){
            boolean result=isPrime(i);
            if(result==false){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        boolean flag=true;
        if(n<2){
            flag=false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        boolean res=isPrime(a);
        nonPrime(a,b);
    }
}
