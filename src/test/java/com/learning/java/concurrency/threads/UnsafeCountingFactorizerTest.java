package com.learning.java.concurrency.threads;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;

class UnsafeCountingFactorizerTest {

//	private final int THREADS = Runtime.getRuntime().availableProcessors();
	private final int THREADS = 5;

	ExecutorService e = Executors.newFixedThreadPool(THREADS);

	class TestTask implements Runnable {
		private UnsafeCountingFactorizer f;

		public TestTask(UnsafeCountingFactorizer t) {
			f = t;
			System.out.println("UnsafeCountingFactorizer = " + t);
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			// TODO Auto-generated method stub
			f.increment();
		}

	}

	@Test
	void test() {
		for (int i = 1; i <= 10; ++i) {
			extracted();
			System.out.println("=============================");
		}
	}

	private void extracted() {
		UnsafeCountingFactorizer factorizer = new UnsafeCountingFactorizer();
		Future result;
		for (int i = 1; i <= THREADS; ++i) {
			result = e.submit(new TestTask(factorizer));
		}
		try {
			Thread.sleep(Duration.ofNanos(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count = " + factorizer.getCount());
	}

}
