package com.rockkim;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account olliesAccount = new Account("12345678", 50000.00, "Rock", "rock@g.com", "192356456");
        olliesAccount.deposit(2000000);
        olliesAccount.withdraw(2050000);

        VipCustomer rocksAccount = new VipCustomer("Rock", "10000000", "rock@gmail.com");
        System.out.println(rocksAccount.getCreditLimit());
    }
}
