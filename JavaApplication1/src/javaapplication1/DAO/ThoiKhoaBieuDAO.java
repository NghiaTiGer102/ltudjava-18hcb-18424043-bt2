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
public class ThoiKhoaBieuDAO {
    
    
     public  List<Khoabieu>  getALL(String ID)
    {
        
        List<Khoabieu> listthoikhoabieu = new ArrayList<Khoabieu>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Khoabieu where maLop = :ID";
                Query query = session.createQuery(hql);
                 query.setParameter("ID", ID);
                listthoikhoabieu = query.list();
        } catch (Exception e) {
            return null;
        }
        finally
        {
            session.close();
        }
        
        
        return listthoikhoabieu;
          
     }
     
     
     public  List<Khoabieu>  getALLByHocKy(String ID,String hocKy)
    {
        
        List<Khoabieu> listthoikhoabieu = new ArrayList<Khoabieu>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Khoabieu where hocKy = :hocKy and maLop = :ID ";
                Query query = session.createQuery(hql);
                   query.setParameter("ID", ID);
                   query.setParameter("hocKy", hocKy);
                listthoikhoabieu = query.list();
        } catch (Exception e) {
            return null;
        }
        finally
        {
            session.close();
        }
        
        
        return listthoikhoabieu;
          
     }
 
    
    
public  Boolean KiemTraTrung(KhoabieuId ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
              String hql = "From Khoabieu where id = :ID ";
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


    public  void  Them(Khoabieu lh)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(lh.getId());
        try {


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
        
    
          
     }
    
}
