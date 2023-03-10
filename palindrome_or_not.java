import java.io.*;
import java.util.*;

public class Solution {
    public static int palindromeOrNot(int n){
        int sum=0;
        while(n!=0){
            int k=n%10;
            sum=sum+k;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=palindromeOrNot(n);
        if(res==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
