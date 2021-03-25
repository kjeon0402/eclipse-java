package day19;

public class Timer2 {
	
	private boolean running;
	
	public void count() throws Exception {
		count(5);
	}
	
	public void count(int second) throws Exception {
		running = true;
		for(int i = second; i >= 0; i--) {
			System.out.println("남은시간 : " + i);
			Thread.sleep(1000);
		}
		running = false;
	}
	
	public boolean isRunning() {
		return running;
	}
}
