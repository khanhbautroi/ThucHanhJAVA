/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Khanh
 */
public class ObjOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileOutputStream fos = new FileOutputStream("fileObject.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Stock[] stocks = { 
            new Stock(1001, "CD ROM", 100.00 , 20),
            new Stock(1002, "DRAM", 75.00 , 20),
            new Stock(1003, "P$ Processor", 300.00 , 100),
            new Stock(1004, "Canon Jet", 80.00 , 10),
            new Stock(1005, "HP Scanner", 75.00 , 90)
        };
        oos.writeObject(stocks);
        oos.close();
    }
}
