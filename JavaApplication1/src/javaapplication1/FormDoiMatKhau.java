/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.Entities.TaiKhoan;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class FormDoiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form FormDoiMatKhau
     */
    public FormDoiMatKhau() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đổi mật khẩu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tài khoản");

        jLabel2.setText("Mật khẩu");

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCapNhat)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTaiKhoan)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
        txtTaiKhoan.setEnabled(false);
        
        txtTaiKhoan.setText(DangNhap.user);
    }//GEN-LAST:event_formWindowOpened

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        
        // Get Current Directory using getAbsolutePath()
        File file = new File("");
        String currentDirectory = file.getAbsolutePath();
        System.out.println("Current working directory : " + currentDirectory);
 
        
        List<TaiKhoan> listTaiKhoan = new ArrayList<TaiKhoan>();
        BufferedReader br = null;
        
        System.out.println(txtTaiKhoan.getText().toLowerCase());
        if(txtTaiKhoan.getText().toLowerCase().equalsIgnoreCase("giaovu"))
        {
           
            currentDirectory+="\\Data\\TaiKhoan\\GiaoVu.txt";
              try {   
            br = new BufferedReader(new FileReader(currentDirectory));       

            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");

            String textInALine;
           
          listTaiKhoan = new ArrayList<TaiKhoan>();
            
            while ((textInALine = br.readLine()) != null) {           
                
                TaiKhoan taikhoan = new TaiKhoan();
                String[] taiKhoanTemp = textInALine.split("\\|");
               taikhoan.setTaiKhoan(taiKhoanTemp[0]);  
               taikhoan.setMatKhau(taiKhoanTemp[1]);  
               listTaiKhoan.add(taikhoan);            
            }
            
            for(TaiKhoan tk :listTaiKhoan)
            {
                if(tk.getTaiKhoan().equals(txtTaiKhoan.getText()))
                {
                    tk.setMatKhau(txtMatKhau.getText());
                }
            }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                }
        }
        else
        {
              currentDirectory+="\\Data\\TaiKhoan\\TaiKhoan.txt";
              try {   
            br = new BufferedReader(new FileReader(currentDirectory));       

            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");

            String textInALine;
           
         listTaiKhoan = new ArrayList<TaiKhoan>();
            
            while ((textInALine = br.readLine()) != null) {           
                
                TaiKhoan taikhoan = new TaiKhoan();
                String[] taiKhoanTemp = textInALine.split("\\|");
               taikhoan.setTaiKhoan(taiKhoanTemp[0]);  
               taikhoan.setMatKhau(taiKhoanTemp[1]);  
               listTaiKhoan.add(taikhoan);            
            }
            
            for(TaiKhoan tk :listTaiKhoan)
            {
                if(tk.getTaiKhoan().equals(txtTaiKhoan.getText()))
                {
                    tk.setMatKhau(txtMatKhau.getText());
                }
            }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                }

        
        }
        
        
         //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     File f = new File(currentDirectory);
        try {
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
               listTaiKhoan.forEach((element) -> {
        String dulieudiemsinhvien = element.getTaiKhoan()+"|"+element.getMatKhau()+"\n";
          try {
              fw.write(dulieudiemsinhvien);
          } catch (IOException ex) {
              Logger.getLogger(formDanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
          }
        });

    
    
     //Bước 3: Đóng luồng
     fw.close();
     
     JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công","Thông báo" , JOptionPane.INFORMATION_MESSAGE);
     this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(FormDoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
   
    }//GEN-LAST:event_btnCapNhatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
