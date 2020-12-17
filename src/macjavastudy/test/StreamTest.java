package macjavastudy.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		String[] strArray = {"A", "B", "C", "D"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.println("strArray : "+a));
		
		System.out.println();
		
		int[] intArray = {4, 3, 2, 1};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(n -> System.out.println("intArray : "+n));
	}
}



