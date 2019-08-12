package com.example.java_prectics;

public class Account
{
    private int accountNumber;
    private String holderName;
    private String IFSC;
    private String Branch;




    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setIFSC(String ifsc) {
        this.IFSC = ifsc;
    }

    public void setBranch(String branch) {
        this.Branch = branch;
    }
    public String getHolderName() {
        return holderName;
    }
    public String getIFSC() {
        return IFSC;
    }
    public String getBranch() {
        return Branch;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    //Depends only on account number
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;
        return result;
    }

    //Compare only account numbers
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
        return true;
    }

}