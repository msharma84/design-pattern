package designpattern.adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {
		
		SocketAdapter socketAdapter = new SocketAdapterImpl();
		
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);
		
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
		
	}
	
	public static Volt getVolt(SocketAdapter socketAdapter, int i) {
		
		switch(i) {
		case 3 : return socketAdapter.get3Volt();
		case 12: return socketAdapter.get12Volt();
		case 120: return socketAdapter.get120Volt();
		default : return socketAdapter.get120Volt();
		}
	}

}
