/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.DAO;
import java.util.ArrayList;
import java.util.List;
import javaapplication1.HibernateUtil;
import javaapplication1.Pojo.*;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Asus
 */
public class TaiKhoanDAO {
    
    public int DangNhap(Taikhoan tk)
    {
     
        int kq=-1;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Taikhoan where maTaiKhoan = :maTaiKhoan and matKhau = :matKhau";
                Query query = session.createQuery(hql);
                query.setParameter("maTaiKhoan", tk.getMaTaiKhoan());
                query.setParameter("matKhau", tk.getMatKhau());
                kq  = query.list().size();
                
               
               return kq;
                
                
        } catch (Exception e) {
            
              
               return kq;
        }
        finally
        {
            session.close();
             return kq;
        }
        
        
       
    }
    
    
    public  Boolean KiemTraTrung(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Taikhoan where maTaiKhoan = :ID ";
                Query query = session.createQuery(hql);
                query.setParameter("ID", ID);
                if(query.list().size()>0)
                {
                    
                    return  true;
                }
            
                return  false;
        } catch (Exception e) 
        {
            return false;
        }
        finally
        {
            session.close();
        
        }
      
        
          
    }


    public  void  ThemTaiKhoan(Taikhoan item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getMaTaiKhoan());
        try {
        
//        String hql = "INSERT INTO Sinhvien (mssv, hoTen,gioiTinh,cmnd,machucvu,malophoc)" +
//                " SELECT :mssv , :hoTen, :gioiTinh , :cmnd , :maChucVu , :maLop from Sinhvien";
//            Query query = session.createQuery(hql);
//               query.setParameter("mssv", sv.getCmnd());
//               query.setParameter("hoTen", sv.getHoTen());
//               query.setParameter("gioiTinh", sv.isGioiTinh());
//                  query.setParameter("maChucVu",sv.getChucvu().getMaChucVu());
//               query.setParameter("cmnd",sv.getCmnd() );
//                query.setParameter("maLop",sv.getLophoc().getMaLop());
//            kq = query.executeUpdate();
    

            if(!kqtrung)
            {
                session.beginTransaction();
                session.save(item);
                session.getTransaction().commit();

            }
    

                
             
              
        } catch (Exception e) {
            return;
        }
        finally
        {
  
            session.close();
         
        }
        
       
          
     }
           
    
}
