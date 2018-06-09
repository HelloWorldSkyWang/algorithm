package com.king.demo;

import org.junit.Test;

public class EightBlock {
	/**
	 *   0 1
	 * 2 3 4 5
	 *   6 7
	 */
	
	@Test
	public void eightBlock() {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++) {
			for(int j = i + 1;j<a.length;j++) {
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				if(this.testRule(a)) {
					printEightBlockArray(a);
					System.out.println("==================");
				}
			}
		}
	}
	@Test
	public void eightBlock2() {

		int[] o = new int[] {1,2,3,4,5,6,7,8};
		int[] a = new int[8];
		int num = 0;
		for(int i1 = 0;i1<a.length;i1++) {
			a[0] = o[i1];
			for(int i2 = 0;i2<a.length;i2++) {
				if(i1==i2) continue;
				a[1] = o[i2];
				for(int i3 = 0;i3<a.length;i3++) {
					if(i1==i3||i2==i3) continue;
					a[2] = o[i3];
					for(int i4 = 0;i4<a.length;i4++) {
						if(i1==i4||i2==i4||i3==i4) continue;
						a[3] = o[i4];
						for(int i5 = 0;i5<a.length;i5++) {
							if(i1==i5||i2==i5||i3==i5||i4==i5) continue;
							a[4] = o[i5];
							for(int i6 = 0;i6<a.length;i6++) {
								if(i1==i6||i2==i6||i3==i6||i4==i6||i5==i6) continue;
								a[5] = o[i6];
								for(int i7 = 0;i7<a.length;i7++) {
									if(i1==i7||i2==i7||i3==i7||i4==i7||i5==i7||i6==i7) continue;
									a[6] = o[i7];
									for(int i8 = 0;i8<a.length;i8++) {
										if(i1==i8||i2==i8||i3==i8||i4==i8||i5==i8||i6==i8||i7==i8) continue;
										a[7] = o[i8];
//										for(int i = 0;i<a.length;i++) {
//											System.out.print(a[i]+" ");
//										}
//										System.out.println();
										if(testRule(a)) {
											printEightBlockArray(a);
											System.out.println("====================");
										}
										num++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(num);
	}


	void printEightBlockArray(int[] array) {
		StringBuffer sb = new StringBuffer();
		sb.append("  ").append(array[0]).append(" ").append(array[1]).append("\n")
			.append(array[2]).append(" ").append(array[3]).append(" ").append(array[4]).append(" ").append(array[5]).append("\n")
			.append("  ").append(array[6]).append(" ").append(array[7]).append("\n");
		System.out.println(sb.toString());
	}
	
	boolean testRule(int[] array) {
		if(array==null) return false;
		if(array.length!=8) return false;
		if(Math.abs(array[0]-array[1])==1) return false;
		if(Math.abs(array[0]-array[2])==1) return false;
		if(Math.abs(array[0]-array[3])==1) return false;
		if(Math.abs(array[0]-array[4])==1) return false;
		
		if(Math.abs(array[1]-array[3])==1) return false;
		if(Math.abs(array[1]-array[4])==1) return false;
		if(Math.abs(array[1]-array[5])==1) return false;
		
		if(Math.abs(array[2]-array[3])==1) return false;
		if(Math.abs(array[2]-array[6])==1) return false;
		
		if(Math.abs(array[3]-array[4])==1) return false;
		if(Math.abs(array[3]-array[6])==1) return false;
		if(Math.abs(array[3]-array[7])==1) return false;
		
		if(Math.abs(array[4]-array[5])==1) return false;
		if(Math.abs(array[4]-array[6])==1) return false;
		if(Math.abs(array[4]-array[7])==1) return false;
		
		if(Math.abs(array[5]-array[7])==1) return false;
		
		if(Math.abs(array[6]-array[7])==1) return false;
		return true;
	}
	
	@Test
	public void main2() {  
         String str[] = {"a","b","c"};  
         arrange(str, 0, str.length);  
    }

	public void swap(String[] str, int i, int j) {
		String temp = new String();
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	public void arrange(String[] str, int st, int len) {
		if (st == len - 1) {
			for (int i = 0; i < len; i++) {
				System.out.print(str[i] + "  ");
			}
			System.out.println();

		} else {
			for (int i = st; i < len; i++) {
				swap(str, st, i);
				arrange(str, st + 1, len);
				swap(str, st, i);
			}
		}

	}
}
