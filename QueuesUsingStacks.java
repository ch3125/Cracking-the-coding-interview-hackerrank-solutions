/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuesusingstacks;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Home
 */
public class QueuesUsingStacks {
 public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
            
        }

        public T peek() {
            if(stackOldestOnTop.empty()){
            while(!stackNewestOnTop.empty()){
                T x=stackNewestOnTop.pop();
                stackOldestOnTop.push(x);
            }}
           return stackOldestOnTop.peek();
          
        
             
        }

        public T dequeue() { 
         
             if(stackOldestOnTop.empty()){
            while(!stackNewestOnTop.empty()){
                T x=stackNewestOnTop.pop();
                stackOldestOnTop.push(x);
            }}
           return stackOldestOnTop.pop(); 
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
    
}
