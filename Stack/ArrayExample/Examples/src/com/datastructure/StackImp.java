package com.datastructure;

public class StackImp {
	private static final int MAX = 1000;
	private String[] stackArray;// = new long[MAX];// Maximum size of Stack
	// public int maxSize;
	private int top;

	public boolean push(String newItem) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			stackArray[++top] = newItem;
			return true;
		}
	}

	public String pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			return stackArray[top--];
		}
	}

	public String peek() {
		if (top < 0) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return stackArray[top];
		}
	}

	public boolean isEmpty() {
		if (top < 0) {//return top < 0;
			return true;
		} else {
			return false;
		}
	}

	public StackImp() {
		// stackArray = new long[maxSize];
		top = -1;
		stackArray = new String[MAX];
	}

	public static void main(String[] args) {
		StackImp imp = new StackImp();
		imp.push("Tolga");
		imp.push("1526");
		imp.push("Duygu");
		System.out.println("Peek:" + imp.peek());
		System.out.println(imp.pop() + " Popped from stack");
		imp.push("Test");
		System.out.println("Peek:" + imp.peek());
		System.out.println(imp.pop() + " Popped from stack");
		System.out.println("Peek:" + imp.peek());
		System.out.println(imp.pop() + " Popped from stack");
		System.out.println("---- no data -----");
		System.out.println("Peek:" + imp.peek());
		System.out.println(imp.pop() + " Popped from stack");
	}
}
