package com.Fyle.banking.dto;

import javax.persistence.Column;

public class BranchesDTO {

    private Long bank_id;

    private String ifsc;

    private String branch;

    private String address;

    private String city;

    private String district;

    private String state;

    private BanksDTO bank;

    public Long getBank_id() {
        return bank_id;
    }

    public void setBank_id(Long bank_id) {
        this.bank_id = bank_id;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BanksDTO getBank() {
        return bank;
    }

    public void setBank(BanksDTO bank) {
        this.bank = bank;
    }
}
