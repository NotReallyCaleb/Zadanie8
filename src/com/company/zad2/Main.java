package com.company.zad2;

public class Main {
    public static void main(String[] args) {
        BANKA A = new BANKA();
        BANKB B = new BANKB();
        BANKC C = new BANKC();
        System.out.println("Bank A: " + A.getBal() + "\nBank B: " + B.getBal() + "\nBank C: " + C.getBal());
    }
}
