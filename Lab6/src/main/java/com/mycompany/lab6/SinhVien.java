/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;
import java.util.*;

/**
 *
 * @author ICT
 */
public class SinhVien {
    String hoTen;
    String email;
    String soDT;
    String cmnd;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        while (true) {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                break;
            } else {
                System.out.println("Email khong hop le. Vui long nhap lai");
            }
        }
        while (true) {
            System.out.print("Nhap so dien thoai: ");
            soDT = sc.nextLine();
            if (soDT.matches("^(0[0-9]{9})$")) {
                break;
            } else {
                System.out.println("So dien thoai khong hop le. Vui long nhap lai");
            }
        }
        while (true) {
            System.out.print("Nhap CMND: ");
            cmnd = sc.nextLine();
            if (cmnd.matches("^[0-9]{9,12}$")) {
                break;
            } else {
                System.out.println("CMND khong hop le. Vui long nhap lai");
            }
        }
    }
    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("SDT: " + soDT);
        System.out.println("CMND: " + cmnd);
    }
}

