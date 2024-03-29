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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.DAO.BangDiemDAO;
import javaapplication1.DAO.LopKhoaBieuDAO;
import javaapplication1.Entities.DiemSV;
import javaapplication1.Entities.SinhVien;
import javaapplication1.Extension.TxtFileNameFilter;
import javaapplication1.Pojo.Bangdiem;
import javaapplication1.Pojo.Lopkhoabieu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asus
 */
public class FormDanhSachDiemSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form FormDanhSachDiemSinhVien
     */
    String[] columnNames = { "STT", "MSSV","Họ tên", "Điểm GK","Điểm CK","Điểm khác","Điểm tổng","Đậu/Rớt" };
    public FormDanhSachDiemSinhVien() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDiemGk = new javax.swing.JTextField();
        txtDiemCK = new javax.swing.JTextField();
        txtDiemKhac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbDiemLop = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lbSoLuongSV = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbDau = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbRot = new javax.swing.JLabel();
        btnCappNhat = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiemSV = new javax.swing.JTable();
        lbSoDau = new javax.swing.JLabel();
        lbSoRot = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();
        lbMSSV = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh sách điểm sinh viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Điểm GK");

        jLabel2.setText("Điểm CK");

        jLabel3.setText("Điểm Khác");

        jLabel4.setText("MSSV");

        jLabel5.setText("Họ tên");

        cmbDiemLop.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbDiemLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiemLopActionPerformed(evt);
            }
        });

        jLabel6.setText("Số lượng sinh viên");

        lbSoLuongSV.setText("0");

        jLabel8.setBackground(new java.awt.Color(51, 0, 255));
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Tỉ lẹ đậu %");

        lbDau.setText("0");

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("T ỉ lệ rớt %");

        lbRot.setText("0");

        btnCappNhat.setText("Cập Nhập");
        btnCappNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCappNhatActionPerformed(evt);
            }
        });

        tbDiemSV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tbDiemSV.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDiemSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDiemSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDiemSV);

        scrollPane1.add(jScrollPane1);

        lbSoDau.setText("0");

        lbSoRot.setText("0");

        jLabel11.setText("Số lượng đậu");

        btnImport.setText("Import CSV");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        lbMSSV.setText("MSSV");

        lbHoTen.setText("HoTen");

        jLabel12.setText("Số lượng rớt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(3, 3, 3)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDiemLop, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbSoLuongSV)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSoDau)
                                    .addComponent(lbDau))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(24, 24, 24)
                                        .addComponent(lbRot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbSoRot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDiemCK)
                                        .addComponent(txtDiemGk)
                                        .addComponent(txtDiemKhac, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCappNhat)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(txtDiemGk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtDiemCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addComponent(lbMSSV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemKhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDiemLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lbSoLuongSV)
                            .addComponent(jLabel8)
                            .addComponent(lbDau))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoDau)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lbRot))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoRot)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCappNhat)
                    .addComponent(btnImport))
                .addGap(112, 112, 112)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void  HienThiDanhSachLopLenCombobox()
    {
       
      Lopkhoabieu lhocdao = new Lopkhoabieu();
        List<Lopkhoabieu> listlophoc =  new LopKhoaBieuDAO().getALL();
        if(listlophoc==null)
        {
            return;
        }
        for(Lopkhoabieu item :listlophoc)
        {
             cmbDiemLop.addItem(item.getMaLopKhoaBieu().toString());
        }
      
    }
    
      
    
    void LoadDuLieuDiemSinhVien(String[] columnNames,String lophoc)
    {
        Double TongSoLuong = 0.0;
        Double SoLuongDau =0.0;
        Double SoLuongRot =0.0;
         File file = new File("");
        String currentDirectory = file.getAbsolutePath();
         
        currentDirectory +="\\Data\\DuLieu\\DanhSachDiemSinhVien\\" + lophoc+ ".txt";
        Path pathToFile = Paths.get(currentDirectory);
        String lopHoc ="";
       
        TongSoLuong =  Double.parseDouble(new BangDiemDAO().getByID(cmbDiemLop.getSelectedItem().toString()).size()+"");
         
        File ff = new File(currentDirectory);
        if(!ff.exists()||TongSoLuong==0)
        {        
          TableModel tablemodel = new DefaultTableModel(null, columnNames);
          tbDiemSV.setModel(tablemodel);
          lbDau.setText(0+"");
          lbRot.setText(0+"");
          

          
          lbSoLuongSV.setText(0+"");
          lbSoRot.setText(0+"");
          lbSoDau.setText(0+"");
          lbHoTen.setText("HoTen");
          lbMSSV.setText("MSSV");
            return;
        }
       
          List<Bangdiem> listDiemSinhVien = new BangDiemDAO().getByID(cmbDiemLop.getSelectedItem().toString());
        
        String[][] listDataDiemSinhVien = new String[listDiemSinhVien.size()][8];
        for(int i =0;i<listDiemSinhVien.size();i++)
        {
              listDataDiemSinhVien[i][0] = (i+1) + "";
              listDataDiemSinhVien[i][1] =  listDiemSinhVien.get(i).getMssv();
              listDataDiemSinhVien[i][2] =  listDiemSinhVien.get(i).getHoTen();
              listDataDiemSinhVien[i][3] =  listDiemSinhVien.get(i).getDiemGk();
              listDataDiemSinhVien[i][4] =  listDiemSinhVien.get(i).getDiemCk();
              listDataDiemSinhVien[i][5] =  listDiemSinhVien.get(i).getDiemKhac();
              double diemTong = (Double.parseDouble(listDiemSinhVien.get(i).getDiemCk())+
                      Double.parseDouble(listDiemSinhVien.get(i).getDiemGk())
                      +Double.parseDouble(listDiemSinhVien.get(i).getDiemKhac()))/3.0; 
              
              
              if(diemTong>=5)
                {
                 SoLuongDau++;
                }
                else
                {
                    SoLuongRot++;
                }
              double diemtongf =  diemTong*4;
              diemTong =   Math.ceil(diemtongf) /4.0;
              listDataDiemSinhVien[i][6] =  diemTong+"";
              String KT="";
              if(diemTong>=5)
              {
                  KT = "Đâu";
              }
              else
                {
                    KT = "Rớt";
                }
               listDataDiemSinhVien[i][7] =  KT+"";
        }
        
        
        
        TableModel tablemodel = new DefaultTableModel(listDataDiemSinhVien, columnNames);
        tbDiemSV.setModel(tablemodel);
        
        lbSoLuongSV.setText(TongSoLuong+"");
        Double phanTramDau = (SoLuongDau/TongSoLuong)*100.0;
        Double phanTramRot =  100- phanTramDau;
       
        DecimalFormat dcf=new DecimalFormat("#.##");
        lbSoDau.setText(SoLuongDau+"");
        lbSoRot.setText(SoLuongRot+"");
    
        lbDau.setText(dcf.format(phanTramDau)+"");
        lbRot.setText(dcf.format(phanTramRot)+"");
        

    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
          TableModel tablemodel = new DefaultTableModel(null, columnNames);
        tbDiemSV.setModel(tablemodel);
        HienThiDanhSachLopLenCombobox();
         if(cmbDiemLop.getItemCount()>0)
        {
             LoadDuLieuDiemSinhVien(columnNames, cmbDiemLop.getSelectedItem().toString());
        }        
    }//GEN-LAST:event_formWindowOpened

    private void tbDiemSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDiemSVMouseClicked
        // TODO add your handling code here:
        int check = tbDiemSV.getSelectedRowCount();
        
        if(check==0)
        {
            return;
        }
        
        lbMSSV.setText(tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 1).toString());
        lbHoTen.setText(tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 2).toString());
        txtDiemGk.setText(tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 3).toString());
        txtDiemCK.setText(tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 4).toString());
        txtDiemKhac.setText(tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 5).toString());
        
        
    }//GEN-LAST:event_tbDiemSVMouseClicked

    private void btnCappNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCappNhatActionPerformed
        // TODO add your handling code here:
        
        Bangdiem diemSV = new Bangdiem();
        diemSV.setMaBangDiem(cmbDiemLop.getSelectedItem().toString()+"-"+tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 1).toString());
        diemSV.setMssv(tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 1).toString());
        diemSV.setHoTen(tbDiemSV.getValueAt(tbDiemSV.getSelectedRow(), 2).toString());
        diemSV.setDiemGk(txtDiemGk.getText());
        diemSV.setDiemCk(txtDiemCK.getText()) ;
        diemSV.setDiemKhac(txtDiemKhac.getText());
        
        
         Double diemTong = (Double.parseDouble(diemSV.getDiemGk())+
                      Double.parseDouble(diemSV.getDiemCk())
                      +Double.parseDouble(diemSV.getDiemKhac()))/3.0; 
         diemSV.setDiemTong(diemTong+"");
         
         double diemtongf =  diemTong*4;
              diemTong =   Math.ceil(diemtongf) /4.0;
         
      new BangDiemDAO().Sua(diemSV);
        
       if(cmbDiemLop.getItemCount()>0)
        {
             LoadDuLieuDiemSinhVien(columnNames, cmbDiemLop.getSelectedItem().toString());
        }
        
        
    }//GEN-LAST:event_btnCappNhatActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
          FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
        
         dialog.setFile("*.CSV");
      
    dialog.setMode(FileDialog.LOAD);
    dialog.setVisible(true);
    String file = dialog.getFile();
    System.out.println(file + " chosen.");
     System.out.println(dialog.getDirectory() + " chosen.");
     
     String fileCSV = dialog.getDirectory()+file;
     
  
     
      List<DiemSV> listDiemSV = new ArrayList<DiemSV>();
        Path pathToFile = Paths.get(fileCSV);
        File ff = new File(fileCSV);
        if(!ff.exists())
        {
            return;
        }
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) 
        {

            // read the first line from the text file
            String line = br.readLine(); 
           
            while (line != null) 
            {
               
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                DiemSV sv = new DiemSV();
                 sv = sv.ThemDiemSV(attributes);
                // adding book into ArrayList
                listDiemSV.add(sv);

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
        currentDirectory +="\\Data\\DuLieu\\DanhSachDiemSinhVien\\" + cmbDiemLop.getSelectedItem().toString()+".txt";
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
       Writer fw = new BufferedWriter(new OutputStreamWriter(
     new FileOutputStream(currentDirectory), "UTF8"));
     //Bước 2: Ghi dữ liệu
     
             BangDiemDAO bdDao = new BangDiemDAO();
     
    listDiemSV.forEach((element) -> {
        
        Bangdiem bd = new Bangdiem(cmbDiemLop.getSelectedItem()+"-"+element.getMSSV(), element.getMSSV(),element.getHoTen(),element.getDiemGK(),element.getDiemCK(),element.getDiemKhac(),element.getDiemT());
        bdDao.Them(bd);
        
        String dulieudiemsinhvien = element.getMSSV()+"|"+element.getHoTen()+"|"+element.getDiemGK()+"|"+element.getDiemCK()+"|"+element.getDiemKhac()+"|"+element.getDiemT()+"\n";
          try {
              fw.write(dulieudiemsinhvien);
          } catch (IOException ex) {
              Logger.getLogger(formDanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
          }
        });

    
    
     //Bước 3: Đóng luồng
     fw.close();
     
     LoadDuLieuDiemSinhVien(columnNames,cmbDiemLop.getSelectedItem().toString());
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Lỗi xin kiểm tra lại","Thông báo" , JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnImportActionPerformed

    private void cmbDiemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiemLopActionPerformed
        // TODO add your handling code here:
         if(cmbDiemLop.getItemCount()>0)
        {
             LoadDuLieuDiemSinhVien(columnNames, cmbDiemLop.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cmbDiemLopActionPerformed

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
            java.util.logging.Logger.getLogger(FormDanhSachDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDanhSachDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDanhSachDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDanhSachDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDanhSachDiemSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCappNhat;
    private javax.swing.JButton btnImport;
    private javax.swing.JComboBox<String> cmbDiemLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDau;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMSSV;
    private javax.swing.JLabel lbRot;
    private javax.swing.JLabel lbSoDau;
    private javax.swing.JLabel lbSoLuongSV;
    private javax.swing.JLabel lbSoRot;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTable tbDiemSV;
    private javax.swing.JTextField txtDiemCK;
    private javax.swing.JTextField txtDiemGk;
    private javax.swing.JTextField txtDiemKhac;
    // End of variables declaration//GEN-END:variables
}
