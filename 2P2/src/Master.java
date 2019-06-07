import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Master {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		int numWorkers = 2;
		int msgs = 10000;
		ExecutorService tpes = Executors.newCachedThreadPool();

		Future<Double> futures1[] = new Future[numWorkers];
		Future<Double> futures2[] = new Future[numWorkers];

		double series1 = 0.0;
		double series2 = 0.0;

		int factor = msgs / numWorkers;

		for (int i = 0; i < numWorkers; i++) {
			futures1[i] = tpes.submit(new Worker1(i * factor, (i + 1) * factor));
			futures2[i] = tpes.submit(new Worker2(i * factor, (i + 1) * factor));
		}
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < numWorkers; i++) {
			series1 += futures1[i].get();
			series2 += futures2[i].get();
		}
		long t2 = System.currentTimeMillis();

		System.out.println("Elapsed: " + (t2 - t1));
		System.out.println("Multiplicao: " + series1 * series2);
		tpes.shutdown();
	}

}
