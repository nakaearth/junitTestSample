package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMain2 {
//	public TestMain2(int max){
//		ExecutorService e = Executors.newFixedThreadPool(3);
//		Future<Integer>[] flist = new Future<Integer>[3];
//		flist[0]=e.submit(new SumTask(0,max/3));
//		flist[1]=e.submit(new SumTask(max/3+1,max*2/3));
//		flist[2]=e.submit(new SumTask(max*2/3+1,max));
//		int ret=0;
//		for(Future f:flist){
//			ret+=((Integer) f.get()).intValue();
//		}
//		e.shutdown();
//	}
//	
//	public static void main(String[] args) {
//		new TestMain2(1000);
//	}
}
