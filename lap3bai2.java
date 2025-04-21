/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
public class lap3bai2 {
public class PhanSo {
    private int tu; 
    private int mau; 
    public PhanSo() {
        tu = 0;
        mau = 1;
    }
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        mau = sc.nextInt();
        while (mau == 0) { 
            System.out.println("Mau so khong duoc bang 0. Nhap lai: ");
            mau = sc.nextInt();
        }
    }
    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }
    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private void rutGon() {
        int ucln = UCLN(tu, mau);
        tu = tu / ucln;
        mau = mau / ucln;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }
    public PhanSo cong(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.mau = mau * p.mau; 
        kq.tu = tu * p.mau + p.tu * mau;
        kq.rutGon();
        return kq;
    }
    public PhanSo tru(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.mau = mau * p.mau; 
        kq.tu = tu * p.mau - p.tu * mau; 
        kq.rutGon(); 
        return kq;
    }
    public PhanSo nhan(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tu = tu * p.tu; 
        kq.mau = mau * p.mau;
        kq.rutGon(); 
        return kq;
    }
    public PhanSo chia(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tu = tu * p.mau; 
        kq.mau = mau * p.tu; 
        kq.rutGon(); 
        return kq;
    }
}
}

