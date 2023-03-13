package com.learningJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		System.out.println(characters);
		Set<Character> linkHashChar = new LinkedHashSet<>(characters);
		System.out.println(linkHashChar);
		Set<Character> treeChar = new TreeSet<>(characters);
		System.out.println(treeChar);
		Set<Character> hashChar = new HashSet<>(characters);
		System.out.println(hashChar);
	}

}
