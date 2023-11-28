package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculadora {

	public int somar(int x , int y) {
		return x + y;
	}
	
	public int divid(int x, int y) {
		return x / y;
	}
}


