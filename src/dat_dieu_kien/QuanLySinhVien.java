/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dat_dieu_kien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh
 */
public class QuanLySinhVien {
    ArrayList<SinhVien> list = new ArrayList<>();
    Scanner p = new Scanner(System.in);
    int n;
    
    public void YC1(){
        
        System.out.print("Nhap so luong sinh vien: ");
        n = Integer.parseInt(p.nextLine());
        for(int i=0;i<n;i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }
    }
    
    public void YC2(){
        System.out.println("\n\tDanh sach sinh vien: ");
        System.out.printf("%-20s %-20s %-30s %-20s %-20s \n", "maSV","hoTen","email","sdt","cmnd");
    }

}
