package lecture10.bankexample;

public class SameAccountException extends RuntimeException {

    public SameAccountException() {
        super("You can't transfer to same account!");
    }
    
}
