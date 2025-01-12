package designpattern.pipeline;

public class StepThree implements Step<Integer, String> {

	public String execute(Integer input) {
		return "The final amount is " + input;
	}

}
