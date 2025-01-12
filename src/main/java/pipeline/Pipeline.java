package designpattern.pipeline;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
	
	private List<Step> pipeLineSteps = new ArrayList<>();
	private Object firstStepInput;
	
	public Pipeline(Object firstStepInput) {
		this.firstStepInput = firstStepInput;
	}	
	
	public void addSteps(Step step) {
		pipeLineSteps.add(step);
	}
	
	public void executeStep() {
		for(Step steps : pipeLineSteps) {
			Object output = steps.execute(firstStepInput);
			firstStepInput = output;
		}
	}
	
	public String getResult() {
        return (String) firstStepInput;
    }
}
