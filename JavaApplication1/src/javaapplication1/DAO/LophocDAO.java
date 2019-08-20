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
public class LophocDAO {
    
    
    public  List<Lophoc>  getALL()
    {
        
        List<Lophoc> listlophoc = new ArrayList<Lophoc>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Lophoc";
                Query query = session.createQuery(hql);
                listlophoc = query.list();
        } catch (Exception e) {
            return null;
        }
        finally
        {
            session.close();
        }
        
        
        return listlophoc;
          
     }
 
    
    
public  Boolean KiemTraTrung(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Lophoc where maLop = :ID ";
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


    public  void  ThemLop(Lophoc lh)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(lh.getMaLop());
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
                session.save(lh);
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
           
    
}
