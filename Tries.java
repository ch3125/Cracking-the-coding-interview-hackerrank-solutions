/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Home
 */
public class Tries {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Trie trie=new Trie();
        while(n>0){
            String op=sc.next();
            switch(op){
                case "add":
                    String x=sc.next();
                    trie.insert(x);
                    break;
                case "find":
                    String x1=sc.next();
                    System.out.println(trie.find(x1));
                    
            }
            
            
            n--;
        }
        
        
        
    }
    
    
    
}
class Trie{
    class Node{
        Map<Character,Node> map;
        boolean isEnd;

        public Node() {
            map=new HashMap<>();
            isEnd=false;
        }   
    }
    
    Node root;

    public Trie() {
        root=new Node();
    }
    
    
    public void insert(String word){
        Node current=root;
   
        for (int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            Node child=current.map.get(ch);
            if(child==null){
                child=new Node();
                current.map.put(ch,child );
            }
            current=child;
        }
        current.isEnd=true;
       
        
    }
    public int find(String word){
        Node current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            Node child=current.map.get(ch);
            if(child==null){
                return 0;
            }
            current=child; 
        }
       
        
    
        Stack<Node> stk=new Stack<>();
        stk.add(current);
        int ret=0;
        while(!stk.isEmpty()){
        Node present=stk.pop();
        if(present.isEnd){
            ret+=present.map.size();
        }
        Set set=present.map.keySet();
        for (Iterator i = set.iterator(); i.hasNext(); ) {
             System.out.println(i.next());
            stk.add((Node)present.map.get(i.next()));}
        
    }
        return ret;
    }
    
    
    
    
}
