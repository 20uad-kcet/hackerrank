import java.io.*;
import java.util.*;

public class Solution {
    static int count(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    static int pow(int a,int b){
        int pow=1;
        for(int i=1;i<=b;i++){
            pow =pow*a;
        }
        return pow;
    }
    static int armstrong(int n){
        int count=count(n);
        int sum=0;
        while(n!=0){
            int k=n%10;
            int res=pow(k,count);
            sum=sum+res;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int first=0;
        int last=0;
        for(int i=a;i<=b;i++){
            int result=armstrong(i);
            if(result==i){
                first=result;
                break;
            }
        }
        for(int n=b;n>=a;n--){
            int result=armstrong(n);
            if(result==n){
                last=result;
                break;
            }
        }
        System.out.println(first+last);
    }
}
