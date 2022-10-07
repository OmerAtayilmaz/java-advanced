package com.example.demo;

public interface DummyCustomerService {
    void addCustomer(String name);
    void removeCustomer(String name);
    void updateCustomer(String name);
    String getCustomer(String name);
}
