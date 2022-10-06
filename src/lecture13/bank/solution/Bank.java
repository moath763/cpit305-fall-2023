package lecture13.bank.solution;

import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    int[] accounts;
    int init_balance;
    ReentrantLock m;


    public Bank(int number_of_account, int init_balance) {
        accounts = new int[number_of_account];
        this.init_balance = init_balance;
        for (int i = 0; i < number_of_account; i++) {
            accounts[i] = init_balance;
        }
        m = new ReentrantLock();
    }

    public void transfer(int from, int to, int amount) {
        m.lock();
        try {
            accounts[from] -= amount;  // LD accounts[from]; DEC amount; STORE accounts[from]
            accounts[to] += amount;
        } finally {
            m.unlock();
        }
    }

    public int getTotal() {
        int sum = 0;
        m.lock();
        try {
            for (int account: accounts) {
                sum += account;
            }
        } finally {
            m.unlock();
        }
        return sum;
    }

    public void displayAccounts() {
        for (int i = 0; i < accounts.length; i++) {
            System.out.printf("[%d]: %d\n", i, accounts[i]);
        }
    }
}
