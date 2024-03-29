package javaapplication1.Pojo;
// Generated Aug 23, 2019 2:10:35 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Lopmonhoc generated by hbm2java
 */
@Entity
@Table(name="lopmonhoc"
    ,catalog="quanlysinhvien"
)
public class Lopmonhoc  implements java.io.Serializable {


     private String maLopMonHoc;
     private String mssv;
     private String hoTen;
     private Boolean gioiTinh;
     private String cmnd;
     private String lopKhoaBieu;

    public Lopmonhoc() {
    }

	
    public Lopmonhoc(String maLopMonHoc, String cmnd) {
        this.maLopMonHoc = maLopMonHoc;
        this.cmnd = cmnd;
    }
    public Lopmonhoc(String maLopMonHoc, String mssv, String hoTen, Boolean gioiTinh, String cmnd, String lopKhoaBieu) {
       this.maLopMonHoc = maLopMonHoc;
       this.mssv = mssv;
       this.hoTen = hoTen;
       this.gioiTinh = gioiTinh;
       this.cmnd = cmnd;
       this.lopKhoaBieu = lopKhoaBieu;
    }
   
     @Id 

    
    @Column(name="MaLopMonHoc", unique=true, nullable=false)
    public String getMaLopMonHoc() {
        return this.maLopMonHoc;
    }
    
    public void setMaLopMonHoc(String maLopMonHoc) {
        this.maLopMonHoc = maLopMonHoc;
    }

    
    @Column(name="MSSV", length=50)
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    
    @Column(name="HoTen", length=500)
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    
    @Column(name="GioiTinh")
    public Boolean getGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    
    @Column(name="CMND", nullable=false)
    public String getCmnd() {
        return this.cmnd;
    }
    
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    
    @Column(name="LopKhoaBieu")
    public String getLopKhoaBieu() {
        return this.lopKhoaBieu;
    }
    
    public void setLopKhoaBieu(String lopKhoaBieu) {
        this.lopKhoaBieu = lopKhoaBieu;
    }




}


