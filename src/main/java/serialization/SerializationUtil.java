package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	
	public static void serialize(Object o, String fileName) throws Exception{
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(o);
		
		if(fos !=null) {
			try {
				fos.close();
			}catch(Exception e) {
				System.err.println("Exception while closing the File Output Stream Object");
			}
		}
	}
	
	public static Object deSerialize(String fileName) throws Exception {
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		return obj;
	}

}
