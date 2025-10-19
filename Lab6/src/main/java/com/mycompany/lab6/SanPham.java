/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class SanPham {
    String tenSp;
    double donGia;
    String hang;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap hang san xuat: ");
        hang = sc.nextLine();
    }
    public void xuat() {
        System.out.println("Ten SP: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Hang: " + hang);
    }
}
