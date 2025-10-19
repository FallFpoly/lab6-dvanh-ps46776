/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author dva22
 */
public class main {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP DANH SACH 5 SAN PHAM");
        for (int i = 0; i < 5; i++) {
            System.out.println("San pham thu"+(i + 1)+":");
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }
        System.out.println("DANH SACH SAN PHAM HANG NOKIA");
        boolean found = false;
        for (SanPham sp : list) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co san pham nao cua hang Nokia");
        }
    }
}

