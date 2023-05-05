/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi3;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class Buoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout1 = new GridLayout(13, 1);
        frame.setLayout(layout1);

        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        FlowLayout layout2 = new FlowLayout(FlowLayout.LEFT);
        FlowLayout layout3 = new FlowLayout(FlowLayout.RIGHT);

        JPanel row1 = new JPanel(layout);
        JButton btnDangKy = new JButton("Đăng ký");
        JButton btnThoat = new JButton("THoát");
        row1.add(btnDangKy, layout2);
        row1.add(btnThoat,layout3);
        frame.add(row1);
        //row2
        //JLabel mssv= new JLabel("Ph30084");
        JPanel row2 = new JPanel(layout);
        row2.add(new JLabel("Ph30084"));
        frame.add(row2);
        //row3
        JPanel row3 = new JPanel(layout2);
        JLabel lblHoten = new JLabel("Họ tên");
        JTextField txtHoten = new JTextField();
        txtHoten.setColumns(20);
        row3.add(lblHoten);
        row3.add(txtHoten);
        frame.add(row3);
        //row4

        //frame.add(lblDiaChi,layout);
        JPanel row4 = new JPanel(layout2);
        JLabel lblDiaChi = new JLabel("Địa chỉ");
        row4.add(lblDiaChi);
        JTextField txtDiachi = new JTextField();
        txtDiachi.setColumns(20);
        row4.add(txtDiachi);
        frame.add(row4);

        //row5
        JPanel row5 = new JPanel(layout2);
        JLabel lblMonTheThao = new JLabel("Môn thể thao");
        row5.add(lblMonTheThao);
        frame.add(row5);

        JPanel row6 = new JPanel(layout2);
        JCheckBox chkBongda = new JCheckBox("Bóng đá");
        JCheckBox chkBongchuyen = new JCheckBox("Bóng chuyền");

        row6.add(chkBongda);
        row6.add(chkBongchuyen);
        frame.add(row6);
        JPanel row7 = new JPanel(layout2);
        JCheckBox chkBongban = new JCheckBox("Bóng bàn");
        row7.add(chkBongban);
        frame.add(row7);

        JPanel row8 = new JPanel(layout2);
        JLabel lblGioiTinh = new JLabel("Giới tính");
        row8.add(lblGioiTinh);
        frame.add(row8);

        JPanel row9 = new JPanel(layout2);
        // JLabel lblrdo = new JLabel();
        //frame.add(lblrdo);
        JRadioButton rdonam = new JRadioButton("Nam");
        JRadioButton rdonu = new JRadioButton("Nữ");
        JRadioButton rdobimat = new JRadioButton("Bí mật");

        ButtonGroup group = new ButtonGroup();
        group.add(rdonam);
        group.add(rdonu);
        group.add(rdobimat);
        row9.add(rdonam);
        row9.add(rdonu);
        row9.add(rdobimat);
        frame.add(row9);

        JPanel row10 = new JPanel(layout2);
        JLabel lblQuocGia = new JLabel("Quốc gia");
        row10.add(lblQuocGia);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Việt nam");
        comboBox.addItem("lào");
        comboBox.addItem("Campuchia");
        comboBox.addItem("thái lan");

        // Thêm JComboBox vào JFrame
        row10.add(comboBox);
        frame.add(row10);

        JPanel rowotp = new JPanel(layout2);
        JLabel lblOTP = new JLabel("OTP");
        JPasswordField txtPass = new JPasswordField(9);
        rowotp.add(txtPass);
        frame.add(lblOTP);
        frame.add(rowotp);

        btnDangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hoten = txtHoten.getText();
                String diaChi = txtDiachi.getText();
                String thethao = "";
                if (chkBongda.isSelected()) {
                    thethao = "Bóng đá";
                }
                if (chkBongchuyen.isSelected()) {
                    thethao = thethao + "Bóng chuyền";
                }
                if (chkBongban.isSelected()) {
                    thethao = thethao + "Bóng bàn";
                }
                String gioitinh;
                if (rdonam.isSelected()) {
                    gioitinh = "Nam";
                } else if (rdonu.isSelected()) {
                    gioitinh = "Nữ";
                } else {
                    gioitinh = "Bí mật";
                }
                String quocGia = (String) comboBox.getSelectedItem();
                String pass = new String(txtPass.getPassword());

                JOptionPane.showMessageDialog(null, "Họ tên:" + hoten + "Địa chỉ" + diaChi
                        + "Môn thể thao" + thethao + "Giới tính" + gioitinh + "Quốc gia" + quocGia + "Pass" + pass);

            }
        });

        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

}
