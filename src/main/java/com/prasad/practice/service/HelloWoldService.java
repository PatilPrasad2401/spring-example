package com.prasad.practice.service;

import com.prasad.practice.model.Address;

public class HelloWoldService {
    private String name;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void sayHello(){
        System.out.println("Hello "+name+" From "+address.getCity().getName()+"!!!");
    }
}
