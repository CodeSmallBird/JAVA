package cn.tedu.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// 执行器服务 			执行器工具类 	缓存线程池
		ExecutorService es = Executors.newCachedThreadPool();
		Future<String> f = es.submit(new CDemo());
		System.out.println(f.get());

	}

}

class CDemo implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "hahah~~~";
	}

}