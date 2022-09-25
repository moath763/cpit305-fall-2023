package lecture10.bankexample;

public class NegativeAmountException extends RuntimeException {

    public NegativeAmountException() {
        super("You cann't transfer negative amount");
    }

}
