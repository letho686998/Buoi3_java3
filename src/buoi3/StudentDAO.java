/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class StudentDAO {
    public static ArrayList<Student> ls = new ArrayList<>();
    //add list student vào list
    public int add(Student st){
        ls.add(st);
        return 1;
    }
    //đếm số student
    public int count(){
        return ls.size();
    }
    //lấy ra tất cả student
    public void getAll(){
        for (Student st : ls) {
            System.out.println(st.toString());
        }
    }
    //tìm kiếm theo id
    public Student findByID(int id){
        for (Student st : ls) {
            if(st.getId()==id){
                return st;
            }
        }
        return null;
    }
    //update theo mã sinh viên
    public int update(Student st1){
        for (Student st : ls) {
            if(st.getId()==st1.getId()){
                st.setName(st1.getName());
                st.setBirthday(st1.getBirthday());
                st.setEmail(st1.getEmail());
                st.setGender(st1.isGender());
                st.setPhone(st1.getPhone());
                return 1;//return 1 là update thành công
            }
        }
        return -1;//k tìm thấy
    }
    //delete
    public int delete(int id){
        Student st = findByID(id);
        if(st!=null){
            ls.remove(st);
            return 1;//xóa oke return 1
        }
        return -1;// k thấy return -1
    }
    public Student getStudentByIndex(int index){
        return ls.get(index);
    }
}
