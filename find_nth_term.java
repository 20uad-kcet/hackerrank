import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==1)
        {
            System.out.print(a-1);
        }
        else{
            System.out.print((a-2)/2); 
        }
    }
}
