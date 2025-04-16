/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dat_dieu_kien;

import java.util.Scanner;

/**
 *
 * @author Khanh
 */
public class SinhVien {
    private String maSV, hoTen, email, sdt, cmnd;
    Scanner p = new Scanner(System.in);
    
    String ktEmail(){
        String kt = "\\w+@\\w+(\\.\\w+){1,2}";
        System.out.print("Nhap vao email: ");
        String email = p.nextLine();
        while(email.matches(kt) == false){
            System.out.print("Email sai dinh dang, vui long nhap lai:");
            email = p.nextLine();
        }
        return email;
    }
    
    String ktSdt(){
        String ktSoDT = "0\\d{9,10}";
        System.out.print("Nhap so dien thoai: ");
        String sdt = p.nextLine();
        while(sdt.matches(ktSoDT)==false){
            System.out.print("So dien thoai sai dinh dang, vui long nhap lai: ");
            sdt = p.nextLine();
        }
        return sdt;
    }
    
    String ktCmnd(){
        String ktSoCMND = "0\\d{11}";
        System.out.print("Nhap so chung minh nhan dan: ");
        String cmnd = p.nextLine();
        while(cmnd.matches(ktSoCMND) == false){
            System.out.print("Chung minh nhan dan nhap sai dinh dang, vui long nhap lai: ");
            cmnd = p.nextLine();
        }
        return cmnd;
    }
    
    public void nhap(){
        System.out.print("Nhap ma sinh vien: ");
        maSV = p.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        hoTen = p.nextLine();
        email = ktEmail();
        sdt = ktSdt();
        cmnd = ktCmnd();
    }
    
    public void xuat(){
        System.out.printf("%-20s %-20s %-30s %-20s %-20s \n", maSV,hoTen,email,sdt,cmnd);
    }
}
