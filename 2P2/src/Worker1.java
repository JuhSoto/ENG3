import java.util.concurrent.Callable;

public class Worker1 implements Callable<Double> {
	private int start;
	private int end;

	public Worker1(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public Double call() {
		double soma = 0.0;
		for (int j = start; j < end; j++) {
			soma += 1 / Math.pow(5, j);
		}
		return soma;
	}
}
