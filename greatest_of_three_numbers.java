import java.io.*;
import java.util.*;

public class Solution {
    public static int greatestOfThree(int a,int b,int c){
        int res;
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int res=greatestOfThree(a,b,c);
        System.out.print(res);
    }
}
