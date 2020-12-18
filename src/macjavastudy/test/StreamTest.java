package macjavastudy.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","신용권","김남준","람다식","병렬처리");
	    Stream<String> stream = list.stream();
	    //stream.forEach(StreamTest::print);
	    stream.forEach(n -> print(n));
	   
	    
	    
	    Stream<String> parallelStream = list.parallelStream();
	    //parallelStream.forEach(StreamTest::print);
	    parallelStream.forEach(n -> print(n));
	}
	
	public static void print(String string) {
		System.out.println(string + " : " + Thread.currentThread().getName());
	}
}



