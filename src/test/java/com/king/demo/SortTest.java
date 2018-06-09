package com.king.demo;

import org.junit.Test;

public class SortTest {
	
	int[] a = new int[] {6,3,1,5,4,7,9,2,8};
	
	@Test
	public void zhijie() {

		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
	//				int t = a[i];
	//				a[i] = a[j];
	//				a[j] = t;
					
				}
			}
		}
		print(a);
	}
	
	@Test
	public void maopao() {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					a[j] = a[j] + a[j+1];
					a[j+1] = a[j] - a[j+1];
					a[j] = a[j] - a[j+1];
				}
			}
		}
		print(a);
	}
	
	
	private void print(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
