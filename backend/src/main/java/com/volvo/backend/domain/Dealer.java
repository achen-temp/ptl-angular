package com.volvo.backend.domain;

import java.util.Map;

public class Dealer {
    
    private String name;
    private String address;
    private String zip;
    private String phone;
    private Map<String, Boolean> slots;

    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Map<String, Boolean> getSlots() {
        return slots;
    }
    public void setSlots(Map<String, Boolean> slots) {
        this.slots = slots;
    }

    
    
}
