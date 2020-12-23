package macjavastudy.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("베토벤","바흐","헨델","모차르트");
	    Stream<String> stream = list.stream();
	    stream.forEach(n -> print(n));
	   
	    
	    
	    Stream<String> parallelStream = list.parallelStream();
	    parallelStream.forEach(n -> print(n));
	}
	
	public static void print(String string) {
		System.out.println(string + " : " + Thread.currentThread().getName());
	}
}



