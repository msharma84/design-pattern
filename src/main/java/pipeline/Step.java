package designpattern.pipeline;

public interface Step<I,O> {
	
	public O execute(I input);

}
