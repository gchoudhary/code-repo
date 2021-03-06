package com.concurrency.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureExample
{

	public static void main(String[] args)
	{
		ExecutorService service = Executors.newSingleThreadExecutor();
		SumTask sumTask = new FutureExample().new SumTask(20);
		Future<Integer> future = service.submit(sumTask);
		Integer result=0;
		try
		{
			result = future.get(2000,TimeUnit.MILLISECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e)
		{
			e.printStackTrace();
		}
		System.out.println(result);

	}
	
	class SumTask implements Callable<Integer> {

		private int num = 0;

		public SumTask(int num) {
			this.num = num;
		}

		@Override
		public Integer call() throws Exception {
			int result = 0;
			for (int i = 1; i <= num; i++) {
				result += i;
				Thread.sleep(1000);
			}
			return result;
		}
	}


}
