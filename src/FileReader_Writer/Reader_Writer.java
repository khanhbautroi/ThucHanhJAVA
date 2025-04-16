/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileReader_Writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Khanh
 */
public class Reader_Writer {
    public static void main(String[] args) {
        File filename = new File("first.txt");
        try{
            FileWriter out = new FileWriter(filename);
            System.out.println("Ghi dữ liệu vào file first.txt");
            out.write("Doc ghi du lieu java");
            out.write("Su dung Stream Charater");
            out.close();
            FileReader input = new FileReader(filename);
            System.out.println("Doc tu file first.txt: ");
            int ch = input.read();
            while(ch != -1){
                System.out.print((char) ch );
                ch= input.read();
            }
        }catch(Exception e){}
    }
}
