import java.io.*;
import java.util.*;

public class Solution {
    public static int sumOfDigit(int n){
        int count=0;
        while(n!=0){
            int k=n%10;
            count=count+k;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=sumOfDigit(n);
        System.out.print(res);
    }
}
