package java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "Call method...";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
ExecutorService ec=Executors.newSingleThreadExecutor(); // it performs single thread
	//executorService- will run the tasks asynchronus mode
//CallableTest c1=new CallableTest();
	Future<String> fut=ec.submit(new CallableTest());
                   System.out.println(fut.get());

	}
}
