/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luong_du_lieu;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Khanh
 */
public class data {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("file1.txt");
        DataInputStream dis = new DataInputStream(fis);
        int items = dis.readInt();
        for(int i=0;i<items; i++){
            int n = dis.readInt();
            System.out.print(n+" ");
        }
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());
        dis.close();
    }
}
