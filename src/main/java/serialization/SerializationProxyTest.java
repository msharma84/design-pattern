package serialization;

import java.io.IOException;

public class SerializationProxyTest {

	public static void main(String[] args) {
		
		String fileName = "data.ser";
		
		Data data = new Data("Mohit");
		
		try {
			SerializationUtil.serialize(data, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Data newData = (Data) SerializationUtil.deSerialize(fileName);
			System.out.println(newData);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
