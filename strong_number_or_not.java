import java.io.*;
import java.util.*;

public class Solution {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int isStrong(int n){
        int sum=0;
        while(n!=0){
            int k=n%10;
            int a=factorial(k);
            sum=sum+a;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=isStrong(n);
        if(res==n){
            System.out.println("Given number is a strong number");
        }
        else{
            System.out.println("Given number is not a strong number");
        }
    }
}
