import java.io.*;
import java.util.*;

public class Solution {
    static boolean auto(int n){
        int res=n*n;
        boolean flag=true;
        while(n!=0 && res!=0){
            int a=n%10;
            int b=res%10;
            if(a!=b){
                flag=false;
                break;
            }
            n=n/10;
            res=res/10;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean result=auto(n);
        if(result)
            System.out.println("Given number is Automorphic number");
        else
            System.out.println("Given number is not an Automorphic number");
    }
}
