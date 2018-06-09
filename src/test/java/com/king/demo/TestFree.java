package com.king.demo;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class TestFree {
	
	@Test
	public void test() {
		int h = 75276295;
		
		System.out.println(h >>> 16);
		System.out.println(h ^ (h >>> 16));
		System.out.println((h ^ (h >>> 16)) & 0x7fffffff);
		
		System.out.println(Integer.parseInt("0001111", 2) & 15);
		System.out.println(Integer.parseInt("0011111", 2) & 15);
		System.out.println(Integer.parseInt("0111111", 2) & 15);
		System.out.println(Integer.parseInt("1111111", 2) & 15);
	}
	
	@Test
	public void testBigDecimal() {
		
		BigDecimal bd1 = new BigDecimal(10000);
		BigDecimal bd2 = new BigDecimal(3);
		
		BigDecimal result = bd1.add(bd2);
		System.out.println(result);
		result = bd1.subtract(bd2);
		System.out.println(result);
		result = bd1.multiply(bd2);
		System.out.println(result);
		result = bd1.divide(bd2,2,BigDecimal.ROUND_DOWN);
		System.out.println(result);
	}
	
	
	@Test
	public void testStream() {
		
		List<Integer> list = new LinkedList<>();
		list.add(11);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(6);
		
		//forEach(Consumer<? super T> action) //只进不出
		//map(Function<? super T, ? extends R> mapper) //有进有出
		//flatMap(Function<? super T,? extends Stream<? extends R>>) //有进有出
		//filter(Predicate<? super T> predicate) //有进出结果

		list.stream().distinct().forEach(e -> System.out.println(e));
		list.stream().forEach(e -> System.out.println(e));
		
		list.stream().map(e -> e + " px").forEach(e -> System.out.println(e));
		list.stream().filter(e -> e>3).forEach(e -> System.out.println(e));
		Optional<Integer> max = list.stream().max((a,b) -> a-b);
		System.out.println(max.get());
		
		
		List<String> strList = new LinkedList<>();
		strList.add("abcf");
		strList.add("bcew");
		strList.add("fefe");
		strList.add("zddf");
		Optional<String> strMax = strList.stream().max((a,b) -> a.compareTo(b));
		Optional<String> strMin = strList.stream().max((a,b) -> {
			if(a.length()<b.length()) return 1;
			else if(a.length()>b.length()) return -1;
			else return -a.compareTo(b);
		});
		System.out.println(strMax.get());
		System.out.println(strMin.get());
	}

}
