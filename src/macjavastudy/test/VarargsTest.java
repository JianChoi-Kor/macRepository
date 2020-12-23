package macjavastudy.test;

public class VarargsTest {

	public static void main(String[] args) {
		sum(1, 2);
		sum(1, 2, 3);
		sum(1, 2, 3, 4);
		sum(1, 2, 3, 4, 5);
	}
	
	public static void sum(int n1, int n2) {
		System.out.println("sumsum : "+ (n1+n2));
	}
//	더 자세한 것이 우선순위가 높다.
	
	public static void sum(int ...num) {
//		가변 파라미터
		
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum : "+sum);
	}

}
