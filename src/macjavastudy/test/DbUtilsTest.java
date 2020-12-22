package macjavastudy.test;

public class DbUtilsTest {

	public static void main(String[] args) {
		
		DbUtils du1 = DbUtils.getInstance();
		
		DbUtils du2 = DbUtils.getInstance();
		
		du1.hello();
		
		System.out.println(du1 == du2);

	}

}
