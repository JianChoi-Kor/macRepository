package macjavastudy.test;

public class RunnableTest implements Runnable {
	int threadNum;
	
	public RunnableTest(int threadNum) {
		this.threadNum = threadNum;
	}
	
	@Override
	public void run() {
		System.out.println(threadNum+"번 thread 동작");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			
		}
		System.out.println(threadNum+"번 threa 중료");
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			Thread t = new Thread(new RunnableTest(i));
			t.start();
		}
		System.out.println("main method 종료");
	}
}

