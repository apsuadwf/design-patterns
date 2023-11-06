package org.ytmf.behavioral.observer.pubsub.jdk;

import java.util.Observable;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 19:06
 */
public class BankAccount extends Observable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * 存款操作
     *
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        balance += amount;
        // 表示状态已经改变
        setChanged();
        // 通知所有观察者
        notifyObservers();
    }

    /**
     * 取款操作
     * @param amount 取款金额
     */
    public void withdraw(double amount) {
        balance -= amount;
        // 表示状态已经改变
        setChanged();
        // 通知所有观察者
        notifyObservers();
    }

    /**
     * 获取当前余额
     * @return 余额
     */
    public double getBalance() {
        return balance;
    }
}
