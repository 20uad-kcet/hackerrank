import java.io.*;
import java.util.*;
public class yuki {
    static int search(int A[],int key){
        int n=A.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(key==A[i]){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
            A[i]=s.nextInt();
        int key=s.nextInt();
        int result=search(A,key);
        System.out.println(result);
    }
}
