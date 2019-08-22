package javaapplication1.Pojo;
// Generated Aug 23, 2019 2:10:35 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Taikhoan generated by hbm2java
 */
@Entity
@Table(name="taikhoan"
    ,catalog="quanlysinhvien"
)
public class Taikhoan  implements java.io.Serializable {


     private String maTaiKhoan;
     private String matKhau;

    public Taikhoan() {
    }

	
    public Taikhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }
    public Taikhoan(String maTaiKhoan, String matKhau) {
       this.maTaiKhoan = maTaiKhoan;
       this.matKhau = matKhau;
    }
   
     @Id 

    
    @Column(name="MaTaiKhoan", unique=true, nullable=false, length=50)
    public String getMaTaiKhoan() {
        return this.maTaiKhoan;
    }
    
    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    
    @Column(name="MatKhau")
    public String getMatKhau() {
        return this.matKhau;
    }
    
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }




}


