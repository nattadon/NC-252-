package Stack;

import java.io.*;  
public class StackX {
1
	   private int maxSize;        // size of stack array
	   private double[] stackArray;
	   private int top;            // top of stack
	//--------------------------------------------------------------
	   public StackX(int s)         // constructor
	      {
	      maxSize = s;             // set array size
	      stackArray = new double[maxSize];  // create array
	      top = -1;                // no items yet
	      }
	//--------------------------------------------------------------
	   public void push(double j)  // put item on top of stack
	      {
		 
		   if(!this.isFull()) {
	      stackArray[++top] = j;    
		   }// increment top, insert item
		   else
			   System.out.print("CAN NOT PUSH"+j);
	      }
	//--------------------------------------------------------------
	   public double pop()         // take item from top of stack
	      {
		   if(!this.isEmpty()) {
	      return stackArray[top--]; 
		   }// access item, decrement top
		   else
		   return 0;
	      }
	//--------------------------------------------------------------
	   public double peek()        // peek at top of stack
	      {
	      return stackArray[top];
	      }
	//--------------------------------------------------------------
	   public boolean isEmpty()    // true if stack is empty
	      {
	      return (top == -1);
	      }
	//--------------------------------------------------------------
	   public boolean isFull()     // true if stack is full
	      {
	      return (top == maxSize-1);
	      }
	//--------------------------------------------------------------
	   }  // end class StackX
	////////////////////////////////////////////////////////////////
	class StackApp
	   {
	   public static void main(String[] args)
	      {
	      StackX theStack = new StackX(3);  // make new stack
	      theStack.push(20);               // push items onto stack
	      theStack.push(40);
	      theStack.push(60);
	      theStack.push(80);

	      /*while( !theStack.isEmpty() )     // until it's empty,
	         {                             // delete item from stack
	         double value = theStack.pop();
	         System.out.print(value);      // display it
	         System.out.print(" ");
	         }  // end while
	      System.out.println("");*/
	      }  // end main()
	   }  // end class StackApp