package day58_exeptions.bank;

import day53_abstract.exercise.Running;

public class NotEnouthMoneyException extends RuntimeException {

    public NotEnouthMoneyException() {
        super("Not enough money in the account");

    }

    public NotEnouthMoneyException(String msg) {
        super(msg);
    }
}
