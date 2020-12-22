package macjavastudy.test;

public class DbUtils {
	
	private static DbUtils du;
	private DbUtils() {{}
	
	
	public static DbUtils getInstance() {
		if(du == null) {
			du = new DbUtils();
		}
		return du;
	}
	
	public void hello() {
		System.out.println("안");
	}
	

}
