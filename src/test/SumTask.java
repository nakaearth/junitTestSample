package test;

import java.util.concurrent.Callable;

class SumTask implements Callable<Integer> {
	int min, max;

	public SumTask(int min_, int max_) {
		min = min_;
		max = max_;
	}

	public Integer call() {
		int ret = 0;
		for (int i = min; i <= max; i++) {
			ret += i;
		}
		return Integer.valueOf(ret);
	}
}