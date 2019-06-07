import java.util.concurrent.Callable;

public class Worker2 implements Callable<Double> {
	private int start;
	private int end;

	public Worker2(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public Double call() {
		double soma = 0.0;
		for (int i = start; i < end; i++) {
			soma += 1 / Math.pow(2, i);
		}
		return soma;
	}
}
