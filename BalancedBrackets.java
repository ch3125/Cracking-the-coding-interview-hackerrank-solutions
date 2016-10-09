/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanced.brackets;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Home
 */
public class BalancedBrackets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            String i;
            i = sc.next();
            char[] str=i.toCharArray();
                Stack<Character> stacky=new Stack<>();
            for(int j=0;j<str.length;j++){
                if(str[j]=='(' || str[j]=='{' || str[j]=='['){
                    if(!stacky.isEmpty()){
                    if(stacky.peek()==')' || stacky.peek()=='}' || stacky.peek()==']')
                        break;
                    else
                        stacky.push(str[j]);}
                    else
                        stacky.push(str[j]);
                }
                else if(str[j]==')') {
                    if(stacky.peek()=='(')
                          stacky.pop();
                    else
                        break;
                }
                 else if(str[j]=='}') {
                    if(stacky.peek()=='{')
                          stacky.pop();
                    else
                        break;
                }
                 else if(str[j]==']') {
                    if(stacky.peek()=='[')
                          stacky.pop();
                    else
                        break;
                }
            }
            if(stacky.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
            
            
            n--;
        }
    }
    
}
