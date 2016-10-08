/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editdistance;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class EditDistance {
    public static int min(int a,int b,int c){
        if(a<b && a<c) return a;
        else if(b<a && b<c) return b;
        else return c;
    }

    public static int E(String x,String y){
        int m=x.length();
        int n=y.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0)
                    dp[i][j]=j;
                else if(j==0)
                    dp[i][j]=i;
                else if(x.charAt(i-1)==y.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=min(dp[i-1][j-1]+1,dp[i-1][j]+1,dp[i][j-1]+1);
                
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be converted: ");
        String x=sc.next();
        System.out.println("Enter the other string");
        String y=sc.next();
        System.out.println("Minimum number of editings required to change "+x+" to "+y+" is "+E(x,y));
    }
    
}
