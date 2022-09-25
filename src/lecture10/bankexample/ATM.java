package lecture10.bankexample;

public class ATM extends Thread {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000_000; i++) {
            int from = (int)(Math.random() * bank.accounts.length);
            int to = (int)(Math.random() * bank.accounts.length);
            double amount = Math.random() * 1000.0;
            try {
                bank.transfer(from, to, amount);
            } catch (SameAccountException ignore) {}
        }
    }
}
