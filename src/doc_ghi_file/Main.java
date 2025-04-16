/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc_ghi_file;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Khanh
 */
class Student implements Serializable {
    private String name;
    private double score;
    private String major;

    public Student(String name, double score, String major) {
        this.name = name;
        this.score = score;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Điểm: " + score + ", Ngành: " + major;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nguyen Van A", 8.5, "Công nghệ thông tin"));
        students.add(new Student("Tran Thi B", 9.0, "Kỹ thuật phần mềm"));
        students.add(new Student("Le Hoang C", 7.5, "Hệ thống thông tin"));

        // Tên tệp lưu trữ
        String filePath = "students.dat";

        // Ghi danh sách sinh viên vào tệp
        xfile.ghifile(filePath, students);

        // Đọc danh sách sinh viên từ tệp
        ArrayList<Student> retrievedStudents = (ArrayList<Student>) xfile.docfile(filePath);

        // Hiển thị thông tin sinh viên đọc từ tệp
        System.out.println("Danh sách sinh viên được đọc từ tệp:");
        if (retrievedStudents != null) {
            for (Student student : retrievedStudents) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không có dữ liệu!");
        }
    }
}
