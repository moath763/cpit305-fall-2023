package lecture10.otherway.bankexample;

import lecture10.bankexample.NegativeAmountException;
import lecture10.bankexample.SameAccountException;

public class Bank {
    public double[] accounts;
    public final double total_balance;

    public Bank(int num_of_accounts, double init_amount) {
        accounts = new double[num_of_accounts];
        for (int i = 0; i < num_of_accounts; i++) {
            accounts[i] = init_amount;
        }
        total_balance = init_amount * num_of_accounts;
    }

    public void transfer(int from, int to, double amount) {
        if (from == to) throw new SameAccountException();
        if (amount <= 0) throw new NegativeAmountException();
        if (accounts[from] < amount) return;
        synchronized (this) {
            accounts[from] -= amount;
            accounts[to] += amount;
        }
    }

    public double actualBalance() {
        double sum = 0;
        for (double amount : accounts) {
            sum += amount;
        }
        return sum;
    }

    public void printAll() {
        int i = 0;
        for (double amount : accounts) {
            System.out.printf("[%d]: %.2f\n", i, amount);
            i++;
        }
    }
    
}
