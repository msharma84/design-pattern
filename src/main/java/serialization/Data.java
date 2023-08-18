package serialization;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = -8243160669218850196L;
	
	private String data;

	public Data(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}
	
	private static class DataProxy implements Serializable{
		
		private static final long serialVersionUID = 8107948837349751145L;
		
		private String dataProxy;
		
		private static final String PREFIX = "ABC";
		private static final String SUFFIX = "DEFG";
		
		public DataProxy(Data d){
			//obscuring data for security
			this.dataProxy = PREFIX + d.data + SUFFIX;
		}
		
		public DataProxy(DataProxy dataProxy2) {
			// TODO Auto-generated constructor stub
		}

		private Object readResolve() throws InvalidObjectException {
			if(dataProxy.startsWith(PREFIX) && dataProxy.endsWith(SUFFIX)){
			return new Data(dataProxy.substring(3, dataProxy.length() -4));
			}else throw new InvalidObjectException("data corrupted");
		}
		
		//replacing serialized object to DataProxy object
		private Object writeReplace(){
			return new DataProxy(this);
		}
		
		private void readObject(ObjectInputStream ois) throws InvalidObjectException{
			throw new InvalidObjectException("Proxy is not used, something fishy");
		}
		
	}

}
