/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoten = sc.nextLine().trim(); 

        int firstSpace = hoten.indexOf(" ");
        int lastSpace = hoten.lastIndexOf(" ");
        String ho = hoten.substring(0, firstSpace);
        String tendem = hoten.substring(firstSpace + 1, lastSpace);
        String ten = hoten.substring(lastSpace + 1);
        System.out.println("Ho: " + ho.toUpperCase());
        System.out.println("Ten dem: " + tendem);
        System.out.println("Ten: " + ten.toUpperCase());
    }
}
