import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class anagrams {
    public static int numberNeeded(String first, String second) {
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<26;i++){
            c1[i]=0;
            c2[i]=0;
        }
        char a='a';
        for(int i=0;i<first.length();i++){
            int t=(int)first.charAt(i)-(int)a;
            c1[t]++;
        }
        for(int i=0;i<second.length();i++){
            int t=(int)second.charAt(i)-(int)a;
            c2[t]++;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            sum+=java.lang.Math.abs(c1[i]-c2[i]);
        }
        
      return sum;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
