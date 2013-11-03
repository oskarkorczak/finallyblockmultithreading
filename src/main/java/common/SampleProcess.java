package common;

public class SampleProcess {

	public void start() {
		try {
			System.out.println("Sample process is going to sleep.");
			sleep(5000);
		} finally {
			sleep(1500);
			System.out.println("Sample process is running finally block.");
		}
	}

	private void sleep(long timeToSleep) {
		try {
			Thread.sleep(timeToSleep);
		} catch (InterruptedException e1) {
			System.out.println("Sample process is running catch block for time to sleep = " + timeToSleep);
		}
	}
}