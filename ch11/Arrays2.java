package ch11;

import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {
	public static void main(String[] args) {
		Integer[] score = {43, 98, 56, 78, 34};
		System.out.println(Arrays.toString(score));
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		Arrays.sort(score, Collections.reverseOrder()); //내림차순
		System.out.println(Arrays.toString(score));
		
		String[] name = {"제니", "로제", "뉴진스", "방탄소년단", "블랙핑크"};
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		Arrays.sort(name, Collections.reverseOrder()); //내림차순
		System.out.println(Arrays.toString(name));
		
	}

}
