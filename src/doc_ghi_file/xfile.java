/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc_ghi_file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Khanh
 */
public class xfile {
    public static void ghifile(String path, Object object){
        try{
            FileOutputStream FOS = new FileOutputStream(path);
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            OOS.writeObject(object);
            OOS.flush();
            FOS.flush();
            OOS.close();
            FOS.close(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static Object docfile(String path) {
        Object list = null;
        try{
            FileInputStream FIS = new FileInputStream(path);
            ObjectInputStream OIS = new ObjectInputStream(FIS) ;
            list = OIS.readObject();
            OIS.close();
            FIS.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    } 
}
