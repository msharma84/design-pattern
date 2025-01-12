package designpattern.pipeline;

public class Main {

	public static void main(String[] args) {
		
		Pipeline pipeline = new Pipeline(100);
		pipeline.addSteps(new StepOne());
		pipeline.addSteps(new StepTwo());
		pipeline.addSteps(new StepThree());
		
		pipeline.executeStep();
		String result = pipeline.getResult();
		System.out.println(result);
	}
}
