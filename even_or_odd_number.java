import java.io.*;
import java.util.*;

public class Solution {
    public static void evenOrOdd(int n){
        if(n%2==0){
            System.out.print("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        evenOrOdd(n);
    }
}
