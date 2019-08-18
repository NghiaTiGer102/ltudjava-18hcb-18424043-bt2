package javaapplication1.Pojo;
// Generated Aug 16, 2019 3:07:40 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Giaovu generated by hbm2java
 */
@Entity
@Table(name="giaovu"
    ,catalog="quanlysinhvien"
)
public class Giaovu  implements java.io.Serializable {


     private String maGiaoVu;
     private String tenGiaoVu;

    public Giaovu() {
    }

	
    public Giaovu(String maGiaoVu) {
        this.maGiaoVu = maGiaoVu;
    }
    public Giaovu(String maGiaoVu, String tenGiaoVu) {
       this.maGiaoVu = maGiaoVu;
       this.tenGiaoVu = tenGiaoVu;
    }
   
     @Id 

    
    @Column(name="MaGiaoVu", unique=true, nullable=false, length=50)
    public String getMaGiaoVu() {
        return this.maGiaoVu;
    }
    
    public void setMaGiaoVu(String maGiaoVu) {
        this.maGiaoVu = maGiaoVu;
    }

    
    @Column(name="TenGiaoVu")
    public String getTenGiaoVu() {
        return this.tenGiaoVu;
    }
    
    public void setTenGiaoVu(String tenGiaoVu) {
        this.tenGiaoVu = tenGiaoVu;
    }




}

