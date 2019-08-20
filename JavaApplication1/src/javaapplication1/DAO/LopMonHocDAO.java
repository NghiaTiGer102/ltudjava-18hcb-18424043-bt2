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
public class LopMonHocDAO {
    
     
    
    public  List<Lopmonhoc> getALl()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Lopmonhoc> listds = new ArrayList<Lopmonhoc>();
        try {
            String hql = "From Lopmonhoc ";
                Query query = session.createQuery(hql);
                    
                listds =  query.list();
            
                return  listds;
        } catch (Exception e) 
        {
          return null;
        }
        finally
        {
            session.close();
        
        }
      
        
          
    }
    
      public  List<Lopmonhoc> getByID(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Lopmonhoc> listds = new ArrayList<Lopmonhoc>();
        try {
            String hql = "From Lopmonhoc where lopKhoaBieu =:lopKhoaBieu ";
                Query query = session.createQuery(hql);
                      query.setParameter("lopKhoaBieu", ID);
                listds =  query.list();
            
                return  listds;
        } catch (Exception e) 
        {
          return null;
        }
        finally
        {
            session.close();
        
        }
      
        
          
    }
      
       public  Lopmonhoc getByMSSV(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Lopmonhoc lmh = new Lopmonhoc();
        try {
            String hql = "From Lopmonhoc where mssv =:mssv ";
                Query query = session.createQuery(hql);
                      query.setParameter("mssv", ID);
                lmh =  (Lopmonhoc)query.list().get(0);
            
                return  lmh;
        } catch (Exception e) 
        {
          return null;
        }
        finally
        {
            session.close();
        
        }
      
        
          
    }
    
    
    
    public  Boolean KiemTraTrung(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Lopmonhoc     where maLopMonHoc = :ID ";
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


    public  void  ThemLopMonHoc(Lopmonhoc item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getMaLopMonHoc());
        try {
        

    

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
    
    
     public  void  XoaLopMonHoc(Lopmonhoc item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getMaLopMonHoc());
        try {
        

    

            if(kqtrung)
            {
                session.beginTransaction();
                session.delete(item);
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
