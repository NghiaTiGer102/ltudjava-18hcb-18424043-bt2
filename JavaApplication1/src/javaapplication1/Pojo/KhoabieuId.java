package javaapplication1.Pojo;
// Generated Aug 21, 2019 1:01:46 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * KhoabieuId generated by hbm2java
 */
@Embeddable
public class KhoabieuId  implements java.io.Serializable {


     private String maKhoaBieu;
     private String tenMonHoc;

    public KhoabieuId() {
    }

    public KhoabieuId(String maKhoaBieu, String tenMonHoc) {
       this.maKhoaBieu = maKhoaBieu;
       this.tenMonHoc = tenMonHoc;
    }
   


    @Column(name="MaKhoaBieu", nullable=false, length=50)
    public String getMaKhoaBieu() {
        return this.maKhoaBieu;
    }
    
    public void setMaKhoaBieu(String maKhoaBieu) {
        this.maKhoaBieu = maKhoaBieu;
    }


    @Column(name="TenMonHoc", nullable=false, length=100)
    public String getTenMonHoc() {
        return this.tenMonHoc;
    }
    
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof KhoabieuId) ) return false;
		 KhoabieuId castOther = ( KhoabieuId ) other; 
         
		 return ( (this.getMaKhoaBieu()==castOther.getMaKhoaBieu()) || ( this.getMaKhoaBieu()!=null && castOther.getMaKhoaBieu()!=null && this.getMaKhoaBieu().equals(castOther.getMaKhoaBieu()) ) )
 && ( (this.getTenMonHoc()==castOther.getTenMonHoc()) || ( this.getTenMonHoc()!=null && castOther.getTenMonHoc()!=null && this.getTenMonHoc().equals(castOther.getTenMonHoc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMaKhoaBieu() == null ? 0 : this.getMaKhoaBieu().hashCode() );
         result = 37 * result + ( getTenMonHoc() == null ? 0 : this.getTenMonHoc().hashCode() );
         return result;
   }   


}


