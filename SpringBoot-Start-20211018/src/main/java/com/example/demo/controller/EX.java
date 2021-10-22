package com.example.demo.controller;

import java.net.SocketTimeoutException;

class Father {
	 Father(char c) { //A
		System.out.print(c); //A
	}
	
}
class Son extends Father{
	   Son() {
		this('A');
		System.out.print("B");	 //B
		}
		Son(char c){//A
		super(c); //A
		}
	}
public class EX {
public static void main(String[] args) {
	Son son = new Son();
}
}
