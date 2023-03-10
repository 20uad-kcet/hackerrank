import java.io.*;
import java.util.*;

public class Solution {
    public static void sumOfNumbers(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        sumOfNumbers(n);
    }
}
