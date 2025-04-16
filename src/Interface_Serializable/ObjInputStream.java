/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khanh
 */
public class ObjInputStream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("fileObject.txt");
            ois = new ObjectInputStream(fis);
            Stock[] stocks1 = (Stock[]) ois.readObject();
            System.out.println("Doc tu file: ");
            for(Stock s : stocks1){
                System.out.println(s);
            }
            ois.close();
            fis.close();
        }catch(Exception e){
            System.out.println("Co loi: "+e);
        } 
    }
}
