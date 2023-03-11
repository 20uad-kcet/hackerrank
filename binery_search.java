import java.io.*;
import java.util.*;
public class yuki {
    static int binerysearch(int A[],int key){
        int count=0;
        int index=-1;
        int l=0;
        int n=A.length;
        int h=n-1;
        while(l<=h){
            count++;
            int mid=(l+h)/2;
            if(A[mid]==key){
                index=mid;
                break;
            }
            else if(key> A[mid])
               l=mid+1;
            else
               h=mid-1;
        }
        System.out.println(count+" ");
        return index;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
            A[i]=s.nextInt();
        int key=s.nextInt();
        int result=binerysearch(A,key);
        System.out.println(result);
    }
}
