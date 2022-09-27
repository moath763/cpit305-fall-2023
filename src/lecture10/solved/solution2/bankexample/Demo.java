package lecture10.solved.solution2.bankexample;

public class Demo {
    public static void main(String[] args) {
        Bank bank = new Bank(10, 1000.0);

        ATM atm1 = new ATM(bank);
        atm1.start();

        ATM atm2 = new ATM(bank);
        atm2.start();

        ATM atm3 = new ATM(bank);
        atm3.start();

        try {
            atm1.join();
            atm2.join();
            atm3.join();
        } catch (InterruptedException ignore) {}

        System.out.printf("Total Balance: %.2f\n", bank.total_balance);
        System.out.printf("Actual Balance: %.2f\n", bank.actualBalance());
        bank.printAll();
    }
}
