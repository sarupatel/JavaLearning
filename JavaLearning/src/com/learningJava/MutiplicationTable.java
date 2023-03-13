package com.learningJava;

public class MutiplicationTable {

	void printTable( ) {
		printTable(5);
	}
	
	void printTable(int table ) {
		printTable(table, 1, 10);
		}
	
	void printTable(int table, int fromRange, int toRange ) {
		if (toRange >= fromRange) {
			for(int i=fromRange; i<=toRange; i++) {
				System.out.printf("%d X %d = %d", table, i, table * i).println();
			}
		}
		else System.out.println("To range cannot be lesser than from range");
	}
}
