/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.DAO.*;
import javaapplication1.Entities.MonHoc;
import javaapplication1.Entities.SinhVien;
import javaapplication1.Extension.TxtFileNameFilter;
import javaapplication1.Pojo.Khoabieu;
import javaapplication1.Pojo.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asus
 */
public class FormThoiKhoaBieu extends javax.swing.JFrame {

    /**
     * Creates new form FormThoiKhoaBieu
     */
    public FormThoiKhoaBieu() {
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

        btnImportCSV = new javax.swing.JButton();
        cmbLopHoc = new javax.swing.JComboBox<>();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThoiKhoaBieu = new javax.swing.JTable();
        cmbHocKi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dtpNgay = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thời khóa biểu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnImportCSV.setText("Inport CSV");
        btnImportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportCSVActionPerformed(evt);
            }
        });

        cmbLopHoc.setEditable(true);
        cmbLopHoc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLopHocActionPerformed(evt);
            }
        });

        tbThoiKhoaBieu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tbThoiKhoaBieu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbThoiKhoaBieu);

        scrollPane1.add(jScrollPane1);

        cmbHocKi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "HK 1", "HK 2", "HK 3" }));
        cmbHocKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHocKiActionPerformed(evt);
            }
        });

        jLabel1.setText("Học Kỳ");

        jLabel2.setText("Thời Khóa biểu");

        jLabel3.setText("Ngày thêm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(cmbHocKi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImportCSV)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(dtpNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbHocKi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addComponent(dtpNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnImportCSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String[] columnNames = { "STT", "Mã môn học","Tên môn học", "Phòng học" };
String hocKy = "";
String matkb = "";
    void LoadDuLieuMonHoc(String[] columnNames,String lophoc)
    {
        
        ThoiKhoaBieuDAO tkbdao = new ThoiKhoaBieuDAO();
        List<Khoabieu> listkb = new ArrayList<Khoabieu>();
        if(cmbHocKi.getSelectedItem().toString().equals("ALL"))
        {
          listkb = tkbdao.getALL(cmbLopHoc.getSelectedItem().toString());
            
        }
        else
        {
             listkb =  tkbdao.getALLByHocKy(cmbLopHoc.getSelectedItem().toString(),cmbHocKi.getSelectedItem().toString());
        }
        
        if(listkb==null||listkb.size()==0)
        {
             TableModel tablemodel = new DefaultTableModel(null, columnNames);
                 tbThoiKhoaBieu.setModel(tablemodel);
                 return;
        }
        
         String[][] listDataMonHoc = new String[listkb.size()][5];
        for(int i =0;i<listkb.size();i++)
        {
              listDataMonHoc[i][0] = (i+1) + "";
              listDataMonHoc[i][1] =  listkb.get(i).getMaLop();
              listDataMonHoc[i][2] =  listkb.get(i).getMaLop();
              listDataMonHoc[i][3] =  listkb.get(i).getMaLop();
             
        }
        
        
        
        TableModel tablemodel = new DefaultTableModel(listDataMonHoc, columnNames);
        tbThoiKhoaBieu.setModel(tablemodel);
        
        
        
    
    }
    
    List<MonHoc> GhiDanhSachMonHoc()
    {
        File file = new File("");
        String currentDirectory = file.getAbsolutePath();
          
        currentDirectory +="\\Data\\DuLieu\\DanhSachMonHoc\\"+"MonHoc.txt";
        Path pathToFile = Paths.get(currentDirectory);
        
         List<MonHoc> listMonHoc = new ArrayList<MonHoc>();
        
        String tenKhoaBieu="";
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
         File ff = new File(currentDirectory);
        if(!ff.exists())
        {
            return null;
        }
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) 
        {

            // read the first line from the text file
            String line = br.readLine();                                         
            while (line != null) 
            {              
                
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split("\\|");
                if(attributes.length<2)
                {
                    return null;
                }
                MonHoc monhoc = new MonHoc();
                monhoc.setPhongHoc(0+"");
                 monhoc = monhoc.ThemMonHoc(attributes);

                // adding book into ArrayList
                listMonHoc.add(monhoc);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
            
            
            // loop until all lines are read
            
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            
        }
        
        return listMonHoc;
        
        
        
    }
    
    
    private void btnImportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportCSVActionPerformed
        
        try {
            // TODO add your handling code here:
            
             if(dtpNgay.getDate() == null)
            {
                 JOptionPane.showMessageDialog(null, "Chưa chọn năm xin kiểm tra lại","Thông báo" , JOptionPane.INFORMATION_MESSAGE);
                 return;
            }
            
        FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");        
         dialog.setFile("*.CSV");

        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getFile();
        System.out.println(file + " chosen.");
         System.out.println(dialog.getDirectory() + " chosen.");
    
         String fileCSV = dialog.getDirectory()+file;
         File ff = new File(fileCSV);
         
         
         
         File f = new File(fileCSV);
             
         matkb  =  dialog.getFile().replace(".csv", "");
         
         
         
        if(!ff.exists())
        {
            return;
        }

     
        List<MonHoc> listMonHoc = new ArrayList<MonHoc>();
        Path pathToFile = Paths.get(fileCSV);
       
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
         hocKy = "";
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) 
        {

            // read the first line from the text file
            String line = br.readLine();                                         
            while (line != null) 
            {
                if(hocKy  == "")
                {
                  String[] attributes = line.split("\\,");   
                  hocKy =attributes[0];
                     line = br.readLine();
                 continue;                 
                 
                }
                
                
                
                
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                MonHoc monhoc = new MonHoc();
                 monhoc = monhoc.ThemMonHoc(attributes);

                // adding book into ArrayList
                listMonHoc.add(monhoc);

                // read next line before looping
                // if end of file reached, line would be null
               line = br.readLine();
            }
            
            
            // loop until all lines are read
            
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            
        }
        
         
         
         
        
            
      
        
        //ghi vao thời khóa biểu
        try {
      File fileghi = new File("");
        String currentDirectory = fileghi.getAbsolutePath();
        currentDirectory +="\\Data\\DuLieu\\DanhSachThoiKhoaBieu\\" +cmbLopHoc.getSelectedItem().toString()+".txt";
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     Writer fw = new BufferedWriter(new OutputStreamWriter(
     new FileOutputStream(currentDirectory), "UTF8"));
     //Bước 2: Ghi dữ liệu
     
           
            
     ThoiKhoaBieuDAO tkbdao = new ThoiKhoaBieuDAO();
     LopKhoaBieuDAO lkbdao = new LopKhoaBieuDAO();
  
     listMonHoc.forEach((element) -> {
         KhoabieuId kbid = new KhoabieuId(matkb, element.getTenMonHoc());
         
         Khoabieu kb = new Khoabieu(kbid, hocKy, dtpNgay.getDate(),cmbLopHoc.getSelectedItem().toString(),element.getPhongHoc());
       tkbdao.Them(kb);
        
        Lopkhoabieu lkb = new Lopkhoabieu(cmbLopHoc.getSelectedItem().toString()+"-"+element.getTenMonHoc(),hocKy );
        lkbdao.Them(lkb);
       
        String dulieumonhoc = element.getMaMonHoc()+"|"+element.getTenMonHoc()+"|"+element.getPhongHoc()+"\n";
          try {
              fw.write(dulieumonhoc);
          } catch (IOException ex) {
              Logger.getLogger(formDanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
          }
        });

    
    
     //Bước 3: Đóng luồng
     fw.close();
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }
        
        
        
    List<Sinhvien> listsv = new SinhVienDAO().getALLByClass(cmbLopHoc.getSelectedItem().toString());
    
      LopMonHocDAO lopmhdao = new LopMonHocDAO();
   listMonHoc.forEach((element) -> {

      
         listsv.forEach((item) ->
         {
             Lopmonhoc lopmh = new Lopmonhoc(element.getTenMonHoc()+item.getMssv()+"-"+matkb, item.getMssv(), item.getHoTen(), item.isGioiTinh(), item.getCmnd(),cmbLopHoc.getSelectedItem().toString()+"-"+element.getTenMonHoc());
             lopmhdao.ThemLopMonHoc(lopmh);
             
         });
        
        
        });
        
         
         
         
       // Ghi danh sách sinh viên vào lớp học
       
       
       
       
   
       
      
    if(cmbLopHoc.getItemCount()>0)
        {
             LoadDuLieuMonHoc(columnNames, cmbLopHoc.getSelectedItem().toString());
        }
         
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Lỗi xin kiểm tra lại","Thông báo" , JOptionPane.INFORMATION_MESSAGE);
        }


        
    }//GEN-LAST:event_btnImportCSVActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        HienThiDanhSachLopLenCombobox();
        TableModel tablemodel = new DefaultTableModel(null, columnNames);
        tbThoiKhoaBieu.setModel(tablemodel);
        this.setLocationRelativeTo(null);
        if(cmbLopHoc.getItemCount()>0)
        {
             LoadDuLieuMonHoc(columnNames, cmbLopHoc.getSelectedItem().toString());
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLopHocActionPerformed
        // TODO add your handling code here:
         if(cmbLopHoc.getItemCount()>0)
        {
             LoadDuLieuMonHoc(columnNames, cmbLopHoc.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cmbLopHocActionPerformed

    private void cmbHocKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHocKiActionPerformed
        // TODO add your handling code here:
        
        
        if(cmbLopHoc.getItemCount()>0)
        {
            LoadDuLieuMonHoc(columnNames, cmbLopHoc.getSelectedItem().toString());
        }
        
        
        
        
    }//GEN-LAST:event_cmbHocKiActionPerformed

    
    
     void  HienThiDanhSachLopLenCombobox()
    {
        
         LophocDAO lhocdao = new LophocDAO();
        List<Lophoc> listlophoc = lhocdao.getALL();
        if(listlophoc==null)
        {
            return;
        }
        for(Lophoc item :listlophoc)
        {
             cmbLopHoc.addItem(item.getMaLop());
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
            java.util.logging.Logger.getLogger(FormThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThoiKhoaBieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportCSV;
    private javax.swing.JComboBox<String> cmbHocKi;
    private javax.swing.JComboBox<String> cmbLopHoc;
    private com.toedter.calendar.JDateChooser dtpNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTable tbThoiKhoaBieu;
    // End of variables declaration//GEN-END:variables
}
