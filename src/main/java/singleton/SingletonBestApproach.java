package designpattern.singleton;

public class SingletonBestApproach {
	
	private static SingletonBestApproach instance;
	
	private SingletonBestApproach() {}
	
	public static SingletonBestApproach getInstanceObject() {
		if(instance == null) {
			synchronized (SingletonBestApproach.class) {
				if(instance == null) {
					instance = new SingletonBestApproach();
				}
			}
		}
		return instance;
	}
	
	@Override 
	protected Object clone() throws CloneNotSupportedException {
		    return instance;
    }

    protected Object readResolve() {
        return instance;
    }

}
