package designpattern.singleton;

public class LazyInitialization {
	
	private static LazyInitialization instance = null;
	
	private LazyInitialization() {}
	
	public static LazyInitialization getInstance() {
		
		// Double check locking
		if(instance==null) {
			synchronized (LazyInitialization.class) {
				if(instance==null) {
					instance = new LazyInitialization();
				}
			}
		}
		return instance;
	}
}
