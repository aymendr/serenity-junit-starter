package starter.steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;

public class MathWizSteps {

    String actor;
    
    Calculator calculator;

    @Step("#actor starts with {0}")
    public void startsWith(int amount) {
        // TODO
    	calculator = new Calculator(amount);
    }

    @Step("#actor adds {0}")
    public void adds(int amount) {
        // TODO
    	calculator.add(amount);
    }

    @Step("#actor should have {0}")
    public void shouldHave(int expectedTotal) {
        // TODO
    	assertThat(calculator.getTotal()).isEqualTo(expectedTotal);
    }
}
