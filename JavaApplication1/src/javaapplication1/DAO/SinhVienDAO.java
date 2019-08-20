/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.DAO;
;

import java.util.ArrayList;
import java.util.List;
import javaapplication1.Pojo.Sinhvien;
import javaapplication1.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;






/**
 *
 * @author Asus
 */
public class SinhVienDAO {
    
    public  List<Sinhvien>  getALL()
    {
        
        List<Sinhvien> listsinhvien = new ArrayList<Sinhvien>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Sinhvien";
                Query query = session.createQuery(hql);
                listsinhvien = query.list();
        } catch (Exception e) {
            return null;
        }
        finally
        {
            session.close();
        }
        
        
        return listsinhvien;
          
     }
    
    
    public  List<Sinhvien>  getALLByClass(String ID)
    {
        
        List<Sinhvien> listsinhvien = new ArrayList<Sinhvien>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Sinhvien where maLop = :ID";
                Query query = session.createQuery(hql);
                query.setParameter("ID", ID);
                listsinhvien = query.list();
        } catch (Exception e) {
            return null;
        }
        finally
        {
            session.close();
        }
        
        
        return listsinhvien;
          
     }
    
    
    
    public  Boolean KiemTraTrung(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Sinhvien where mssv = :ID ";
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
    
    
        public  Sinhvien  getByID(String ID)
    {
        
        Sinhvien sv= new Sinhvien();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Sinhvien where mssv = :ID ";
                Query query = session.createQuery(hql);
                query.setParameter("ID", ID);
                if(query.list().size()>0)
                {
                    sv = (Sinhvien)query.list().get(0);
                }
        } catch (Exception e) {
            return null;
        }
        finally
        {
              
            session.close();
             return sv;
        }
        
     
          
     }
        
        
        public  Sinhvien  getByName(String Name)
    {
        
        Sinhvien sv= new Sinhvien();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Sinhvien where hoTen = :Name ";
                Query query = session.createQuery(hql);
                query.setParameter("Name", Name);
                if(query.list().size()>0)
                {
                    sv = (Sinhvien)query.list().get(0);
                }
        } catch (Exception e) {
            return null;
        }
        finally
        {
            session.close();
        }
        
        return sv;
          
     }
        
        
           public  void  ThemSinhVien(Sinhvien sv)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(sv.getMssv());
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
                session.save(sv);
                session.getTransaction().commit();

            }
    

                
             
              
        } catch (Exception e) {
            return;
        }
        finally
        {
  
            session.close();
        }
        
        return;
          
     }
           
           
           public static void main(String[] args) {
               
         SinhVienDAO sv= new SinhVienDAO();
        
    }
    

    
 
}


