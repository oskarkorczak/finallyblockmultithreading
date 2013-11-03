package daemon;

import common.ProcessLauncher;

public class DaemonRunner {

	public static void main(String[] args) {
		new ProcessLauncher().launchAsDaemon();
	}
}