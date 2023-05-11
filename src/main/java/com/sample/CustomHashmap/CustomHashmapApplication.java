package com.sample.CustomHashmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomHashmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomHashmapApplication.class, args);
		System.out.println("Custom HashMap");
		MyMap<Integer, String> map = new MyMap<>();
		map.put(1, "Batman");
		map.put(2, "Superman");
		map.put(3, "Spiderman");
		map.put(4, "IronMan");
		map.put(5, "Hulk");
		map.put(6, "Captain America");
		map.put(7, "Wonder Women");
		map.put(8, "Groot");
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(map.get(5));
		System.out.println(map.get(6));
		System.out.println(map.get(7));
		System.out.println(map.get(8));
		map.remove(2);
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(map.get(5));
		System.out.println(map.get(6));
		System.out.println(map.get(7));
		System.out.println(map.get(8));
	}
}
