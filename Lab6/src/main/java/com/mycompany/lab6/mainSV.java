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
public class mainSV {
    public class main {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== NHẬP DANH SÁCH 5 SINH VIÊN ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nSinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }

        System.out.println("\n=== DANH SÁCH SINH VIÊN VỪA NHẬP ===");
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }
}
}
