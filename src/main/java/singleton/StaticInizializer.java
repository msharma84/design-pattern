package designpattern.singleton;

public class StaticInizializer {
	
	private static StaticInizializer instance;
	
	private StaticInizializer() {}
	
	static {
		try {
			instance = new StaticInizializer();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static StaticInizializer getInstance() {
		return instance;
	}
}
