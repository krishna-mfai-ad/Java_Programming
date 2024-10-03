package com.Coding;

import java.util.*;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcd";
		char[] charArr = s.toCharArray();
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < charArr.length; i++) {
			list.add(charArr[i]);
		}
		HashSet<Character> set = new HashSet<>(list);
		
		System.out.println(set);
	}

}
