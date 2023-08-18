package designpattern.nullObject;

import java.io.Serializable;

public class NullShapeSingleton implements Cloneable, Serializable  {

	private static final long serialVersionUID = -5734601783519554613L;
	
	private static NullShape nullShape = null; 
	
	public static NullShape getNullShapeObject() {
		if(nullShape == null) {
			synchronized (NullShapeSingleton.class) {
				if(nullShape == null) {
					nullShape = new NullShape();
				}
			}
		}
		return nullShape;
	}
	
	@Override 
	protected Object clone() throws CloneNotSupportedException {
		    return nullShape;
    }

    protected Object readResolve() {
        return nullShape;
    }
}
