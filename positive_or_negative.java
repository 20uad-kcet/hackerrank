import java.io.*;
import java.util.*;

public class Solution {
    public static void positiveOrNegative(int n){
        if(n>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        positiveOrNegative(n);
    }
}
