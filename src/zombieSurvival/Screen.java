package zombieSurvival;

import java.util.concurrent.TimeUnit;

public class Screen {
	public static void waitClear(long wait) throws InterruptedException{
		TimeUnit.SECONDS.sleep(wait);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
