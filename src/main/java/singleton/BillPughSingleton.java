package designpattern.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {}
	
	private static class LazyHolder{
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	public BillPughSingleton getInstance() {
		
		return LazyHolder.instance;
	}

}
