/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luong_du_lieu;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Khanh
 */
public class Input {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("file1.txt");
        int c;
        while((c=fis.read()) != -1){
            System.out.print((char) c);
        }
        fis.close();
    }
}
