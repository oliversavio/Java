package com.oliver.thread_analysis;

public class Computing {

	
	public void computeIntensely() {
		long start = System.currentTimeMillis();
		while(System.currentTimeMillis() - start != 50000) {
			double val=10;
			Math.sqrt(Math.pow(val, 10));
		}
	}
	

	public static void main(String[] args) {
		Computing c = new Computing();
		c.computeIntensely();
	}
	
	
}
