package designpattern.pipeline;

public class StepTwo implements Step<Integer, Integer> {

	public Integer execute(Integer input) {
		return input + 200;
	}

}
