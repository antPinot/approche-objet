package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		// Avec un builder
		
		StringBuilder builder = new StringBuilder();
		
		long start = System.currentTimeMillis();
		
		for (int i=1; i<=100_000; i++) {
			builder.append(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(builder);
		
		System.out.println(end - start); // 24 ms
		
		// Avec la classe String et le "+"
		
		
		long start1 = System.currentTimeMillis();
		
		for (int i=1; i<=100_000; i++) {
			System.out.println(+ i);;
		}
		
		long end1 = System.currentTimeMillis();
		
		System.out.println(end1 - start1); // 718 ms
		

	}

}
