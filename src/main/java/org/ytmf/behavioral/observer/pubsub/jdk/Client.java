package org.ytmf.behavioral.observer.pubsub.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 19:05
 */
public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0);

        Observer observer1 = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("客户1: 余额已更新为 " +
                        ((BankAccount) o).getBalance());
            }
        };
        Observer observer2 = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("客户2: 余额已更新为 " +
                        ((BankAccount) o).getBalance());
            }
        };

        bankAccount.addObserver(observer1);
        bankAccount.addObserver(observer2);

        // 存款操作，触发观察者更新
        bankAccount.deposit(100.0);
        // 取款操作，触发观察者更新
        bankAccount.withdraw(50.0);
    }
}

