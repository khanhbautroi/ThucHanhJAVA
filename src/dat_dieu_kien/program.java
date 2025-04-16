/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dat_dieu_kien;

import dat_dieu_kien.QuanLySinhVien;
import java.util.Scanner;
/**
 *
 * @author Khanh
 */
public class program {
    public static void Menu(){
        System.out.println("---------------------------Menu--------------------");
        System.out.println("1.Nhap danh sach sinh vien");
        System.out.println("2.Danh sach sinh vien");
        System.out.println("3.Sinh vien duoc tim theo ma");
        System.out.println("4.Tim va cap nhat sinh vien theo ma sinh vien");
        System.out.println("5.Xoa sinh vien theo cmnd ");
        System.out.println("6.Thoat");
        System.out.println("----------------------------------------------------");
    }
    
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        int chon;
        while(true){
            Scanner sc = new Scanner(System.in);
            Menu();
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    System.out.println("\n\tNhap danh sach sinh vien");
                    qlsv.YC1();
                    break;
                case 2:
                    System.out.println("\n\tDanh sach sinh vien");
                    qlsv.YC2();
                    break;
            }
        }
        
        
    }
    
    
    
    
    
}
