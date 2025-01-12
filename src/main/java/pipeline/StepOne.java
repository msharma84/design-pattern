package designpattern.pipeline;

public class StepOne implements Step<Integer, Integer> {

	public Integer execute(Integer input) {
		return input + 100;
	}

}
