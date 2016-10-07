import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arrayRotation {

    public static void arrayLeftRotation(int[] a, int n, int k) {
        while(k>0){
           int x=a[0];
            for(int i=1;i<n;i++){
                a[i-1]=a[i];
            }
            a[n-1]=x;
            
            k--;
        }
      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
      
    
      arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
      
        System.out.println();
      
    }
}