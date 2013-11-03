package common;

public class ProcessLauncher {

	public void launchAsThread() {
		this.launch("Thread", false);
	}

	public void launchAsDaemon() {
		this.launch("Daemon", true);
	}

	private void launch(String processName, boolean isDaemon) {

		Thread process = new Thread(){

			@Override
			public void run() {
				new SampleProcess().start();
			}
		};
		process.setDaemon(isDaemon);
		process.start();
		System.out.println(processName + " runner is going to interrupt sample process.");
		process.interrupt();
	}

}
