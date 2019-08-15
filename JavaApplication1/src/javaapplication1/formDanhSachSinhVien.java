/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.org.apache.xerces.internal.impl.dtd.models.CMBinOp;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.Entities.SinhVien;
import javaapplication1.Entities.TaiKhoan;
import javaapplication1.Extension.TxtFileNameFilter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author Asus
 */
public class formDanhSachSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form formDanhSachSinhVien
     */
    
      String[] columnNames = { "STT", "MSSV","Họ tên", "Gới tính","CMND" };
    public formDanhSachSinhVien() {
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

        btngGioiTinh = new javax.swing.ButtonGroup();
        btnInportCSV = new javax.swing.JButton();
        txtCMND = new javax.swing.JTextField();
        txtMSSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        cmbDanhSachLopHoc = new javax.swing.JComboBox<>();
        scrollPane2 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhSachSinhVien = new javax.swing.JTable();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh sách sinh viên");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnInportCSV.setText("Import CSV");
        btnInportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInportCSVActionPerformed(evt);
            }
        });

        jLabel1.setText("MSSV");

        jLabel2.setText("Họ và tên");

        jLabel3.setText("Giới tính");

        jLabel5.setText("CMND");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        cmbDanhSachLopHoc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbDanhSachLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDanhSachLopHocActionPerformed(evt);
            }
        });

        tbDanhSachSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tbDanhSachSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDanhSachSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDanhSachSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDanhSachSinhVien);

        scrollPane2.add(jScrollPane1);

        btngGioiTinh.add(rdbNam);
        rdbNam.setText("Nam");
        rdbNam.setVerifyInputWhenFocusTarget(false);

        btngGioiTinh.add(rdbNu);
        rdbNu.setText("Nu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInportCSV)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDanhSachLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdbNam))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdbNu)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCMND)
                                        .addComponent(txtHoTen)
                                        .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 214, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdbNam)
                                .addComponent(rdbNu)))
                        .addGap(18, 18, 18)
                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(cmbDanhSachLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInportCSV))
                .addGap(59, 59, 59)
                .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInportCSVActionPerformed
        // TODO add your handling code here:
        
        
        
        try {
            FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
        
         dialog.setFile("*.CSV");
      
    dialog.setMode(FileDialog.LOAD);
    dialog.setVisible(true);
    String file = dialog.getFile();
    System.out.println(file + " chosen.");
     System.out.println(dialog.getDirectory() + " chosen.");
     
     String fileCSV = dialog.getDirectory()+file;
     
     String  lopHoc = "";
     
      File ff = new File(fileCSV);
        if(!ff.exists())
        {
            return;
        }
     
      List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        Path pathToFile = Paths.get(fileCSV);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) 
        {

            // read the first line from the text file
            String line = br.readLine(); 
            int stt=1;
            while (line != null) 
            {
                if(lopHoc  == "")
                {
                String[] attributes = line.split("\\,");
                lopHoc = attributes[0];
                 line = br.readLine();
                 continue;
                }
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                SinhVien sv = new SinhVien();
                 sv = sv.ThemSinhVien(attributes);
                // adding book into ArrayList
                listSinhVien.add(sv);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
            
            
            // loop until all lines are read
            

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
         try {
      File fileghi = new File("");
        String currentDirectory = fileghi.getAbsolutePath();
        currentDirectory +="\\Data\\DuLieu\\DanhSachSinhVien\\" + lopHoc+".txt";
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     Writer fw = new BufferedWriter(new OutputStreamWriter(
     new FileOutputStream(currentDirectory), "UTF8"));
     //Bước 2: Ghi dữ liệu
     
    listSinhVien.forEach((element) -> {
        String dulieusinhvien = element.getmSSV()+"|"+element.getHoTen()+"|"+element.getGioiTinh()+"|"+element.getcMND()+"\n";
          try {
              fw.write(dulieusinhvien);
          } catch (IOException ex) {
              Logger.getLogger(formDanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
          }
        });

    
    
    
     //Bước 3: Đóng luồng
     fw.close();
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }
         
         
          try {
      File fileghi = new File("");
        String currentDirectory = fileghi.getAbsolutePath();
        currentDirectory +="\\Data\\TaiKhoan\\"+"TaiKhoan.txt";
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
    Writer fw = new BufferedWriter(new OutputStreamWriter(
     new FileOutputStream(currentDirectory,true), "UTF8"));
     //Bước 2: Ghi dữ liệu
     
    listSinhVien.forEach((element) -> {
        String dulieusinhvien = element.getmSSV()+"|"+element.getmSSV()+"\n";
          try {
              fw.append(dulieusinhvien);
          } catch (IOException ex) {
              Logger.getLogger(formDanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
          }
        });

    
    
     //Bước 3: Đóng luồng
     fw.close();
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }

        HienThiDanhSachLopLenCombobox();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi xin kiểm tra lại","Thông báo" , JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
          
    
    }//GEN-LAST:event_btnInportCSVActionPerformed

    void LoadDuLieuSinHVien(String[] columnNames,String lophoc)
    {
         File file = new File("");
        String currentDirectory = file.getAbsolutePath();
          List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        currentDirectory +="\\Data\\DuLieu\\DanhSachSinhVien\\" + lophoc+".txt";
        Path pathToFile = Paths.get(currentDirectory);
        String lopHoc ="";
         
      
      
        
         File ff = new File(currentDirectory);
        if(!ff.exists())
        {
            return;
        }
        
        
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) 
        {

            // read the first line from the text file
            String line = br.readLine();                                         
            while (line != null) 
            {
               
               String[] attributes = line.split("\\|");
                SinhVien sv = new SinhVien();
                 sv = sv.ThemSinhVien(attributes);
                // adding book into ArrayList
                listSinhVien.add(sv);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
            
            
            // loop until all lines are read
            

        } catch (IOException ioe) 
        {
            System.out.println("javaapplication1.formDanhSachSinhVien.formWindowOpened()");
            ioe.printStackTrace();
          
        }
        
        
        String[][] listDataSinhVien = new String[listSinhVien.size()][5];
        for(int i =0;i<listSinhVien.size();i++)
        {
              listDataSinhVien[i][0] = (i+1) + "";
              listDataSinhVien[i][1] =  listSinhVien.get(i).getmSSV();
              listDataSinhVien[i][2] =  listSinhVien.get(i).getHoTen();
              listDataSinhVien[i][3] =  listSinhVien.get(i).getGioiTinh();
              listDataSinhVien[i][4] =  listSinhVien.get(i).getcMND();
        }
        
        
        
        TableModel tablemodel = new DefaultTableModel(listDataSinhVien, columnNames);
        tbDanhSachSinhVien.setModel(tablemodel);
        
    
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        TableModel tablemodel = new DefaultTableModel(null, columnNames);
        tbDanhSachSinhVien.setModel(tablemodel);
        this.setLocationRelativeTo(null);
        rdbNam.setSelected(true);
        HienThiDanhSachLopLenCombobox();         
        if(cmbDanhSachLopHoc.getItemCount()>0)
        {
             LoadDuLieuSinHVien(columnNames,cmbDanhSachLopHoc.getSelectedItem().toString());
        }
       
                        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
        
        
         File file = new File("");
        String currentDirectory = file.getAbsolutePath();
          List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        currentDirectory +="\\Data\\DuLieu\\DanhSachSinhVien\\" + cmbDanhSachLopHoc.getSelectedItem().toString()+".txt";
       
        String lopHoc ="";
        
        if(txtCMND.getText().length()==0||txtMSSV.getText().length()==0||txtHoTen.getText().length()==0)
        {
             JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ xin kiểm tra lại","Thông báo" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
         File ff = new File(currentDirectory);
        if(!ff.exists())
        {
            return;
        }
        
         Path pathToFile = Paths.get(currentDirectory);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) 
        {

            // read the first line from the text file
            String line = br.readLine();                                         
            while (line != null) 
            {
               
               String[] attributes = line.split("\\|");
                SinhVien sv = new SinhVien();
                 sv = sv.ThemSinhVien(attributes);
                // adding book into ArrayList
                listSinhVien.add(sv);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
            
             for(int i=0;i<listSinhVien.size();i++)
            {
                if(txtMSSV.getText().equals(listSinhVien.get(i).getmSSV()))
                {
                    JOptionPane.showMessageDialog(null, "MSSV đã tồn tại xin kiểm tra lại","Thông báo" , JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            
            
            // loop until all lines are read
            

        } catch (IOException ioe) 
        {
            System.out.println("javaapplication1.formDanhSachSinhVien.formWindowOpened()");
            ioe.printStackTrace();
          
        }
        
         
         String gioiTinh="";
         if(rdbNam.isSelected())
         {
             gioiTinh =rdbNam.getText();
         }
         else
         {
             gioiTinh = rdbNu.getText();
         }
        
        SinhVien sv = new SinhVien(txtMSSV.getText(),txtHoTen.getText(),gioiTinh,txtCMND.getText());
        listSinhVien.add(sv);
              
              
              try {
      File fileghi = new File("");
        
        
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     Writer fw = new BufferedWriter(new OutputStreamWriter(
     new FileOutputStream(currentDirectory), "UTF8"));
     //Bước 2: Ghi dữ liệu
     
    listSinhVien.forEach((element) -> {
        String dulieusinhvien = element.getmSSV()+"|"+element.getHoTen()+"|"+element.getGioiTinh()+"|"+element.getcMND()+"\n";
          try {
              fw.write(dulieusinhvien);
          } catch (IOException ex) {
              Logger.getLogger(formDanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
          }
        });
  
    
    
     //Bước 3: Đóng luồng
     fw.close();
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }
              
              
               try {
      File fileghi = new File("");
         currentDirectory = fileghi.getAbsolutePath();
        currentDirectory +="\\Data\\TaiKhoan\\"+"TaiKhoan.txt";
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     Writer fw = new BufferedWriter(new OutputStreamWriter(
     new FileOutputStream(currentDirectory,true), "UTF8"));
     //Bước 2: Ghi dữ liệu
     
    
        String dulieusinhvien = txtMSSV.getText()+"|"+txtMSSV.getText()+"\n";
          try {
              fw.append(dulieusinhvien);
          } catch (IOException ex) {
              Logger.getLogger(formDanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
          }
      

    
    
     //Bước 3: Đóng luồng
     fw.close();
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }
        
        LoadDuLieuSinHVien(columnNames, cmbDanhSachLopHoc.getSelectedItem().toString());
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void cmbDanhSachLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDanhSachLopHocActionPerformed
        // TODO add your handling code here:
        if(cmbDanhSachLopHoc.getItemCount()>0)
        {
            LoadDuLieuSinHVien(columnNames, cmbDanhSachLopHoc.getSelectedItem().toString());
        }
        
        
    }//GEN-LAST:event_cmbDanhSachLopHocActionPerformed

    private void tbDanhSachSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDanhSachSinhVienMouseClicked
        // TODO add your handling code here:
        txtMSSV.setText(tbDanhSachSinhVien.getValueAt(tbDanhSachSinhVien.getSelectedRow(), 1).toString());
        txtHoTen.setText(tbDanhSachSinhVien.getValueAt(tbDanhSachSinhVien.getSelectedRow(), 2).toString());
        
        if(tbDanhSachSinhVien.getValueAt(tbDanhSachSinhVien.getSelectedRow(), 3).toString().contains("Nam"))
        {
            rdbNam.setSelected(true);
        }
        else
        {
             rdbNu.setSelected(true);
        }
        
      
        txtCMND.setText(tbDanhSachSinhVien.getValueAt(tbDanhSachSinhVien.getSelectedRow(), 4).toString());
        
    }//GEN-LAST:event_tbDanhSachSinhVienMouseClicked

    public boolean accept(File dir, String name) {
 
        if (name.endsWith(".txt")) {
            return true;
        }
 
        return false;
    }
    
     void  HienThiDanhSachLopLenCombobox()
    {
       cmbDanhSachLopHoc.removeAllItems();;
         File fileghi = new File("");
        String currentDirectory = fileghi.getAbsolutePath();
        currentDirectory +="\\Data\\Dulieu\\DanhSachSinhVien";
        File dir = new File(currentDirectory);
 
        File[] txtFiles = dir.listFiles(new TxtFileNameFilter());
 
        for (File txtFile : txtFiles) {
             File f = new File(txtFile.getAbsolutePath());
              
             
            cmbDanhSachLopHoc.addItem(f.getName().toString().replace(".txt", ""));
        }
    }
    
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
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDanhSachSinhVien().setVisible(true);
                
            }          
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInportCSV;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup btngGioiTinh;
    private javax.swing.JComboBox<String> cmbDanhSachLopHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JTable tbDanhSachSinhVien;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}
