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
public class BangDiemDAO {
    
    

      public  List<Bangdiem> getByID(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Bangdiem> listds = new ArrayList<Bangdiem>();
        try {
            String hql = "From Bangdiem where maBangDiem like :maBangDiem ";
                Query query = session.createQuery(hql);
                      query.setParameter("maBangDiem", "%" +ID+"%");
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
      
      
      public Bangdiem getByMSSV(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
       Bangdiem bh = new Bangdiem();
        try {
            String hql = "From Bangdiem where mssv = :mssv ";
                Query query = session.createQuery(hql);
                      query.setParameter("mssv",ID);
                bh =  (Bangdiem)query.list().get(0);
            
                return  bh;
        } catch (Exception e) 
        {
          return null;
        }
        finally
        {
            session.close();
        
        }
      
        
          
    }
      
      public List<Bangdiem> getListByMSSV(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Bangdiem> list = new ArrayList<Bangdiem>();
       
        try {
            String hql = "From Bangdiem where mssv = :mssv ";
                Query query = session.createQuery(hql);
                      query.setParameter("mssv",ID);
                list =  query.list();
            
                return  list;
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
            String hql = "From Bangdiem     where maBangDiem = :ID ";
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


    public  void  Them(Bangdiem item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getMaBangDiem());
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
    
    public  void  Sua(Bangdiem item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getMaBangDiem());
        try {
        

    

            if(kqtrung)
            {
                session.beginTransaction();
                session.update(item);
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
    
    
     public  void  Xoa(Bangdiem item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getMaBangDiem());
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
