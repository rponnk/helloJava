package com.rockkim;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("John Does", "10000", "john@doe.com");
        System.out.println("Default vipCustomer Called");
    }

    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
