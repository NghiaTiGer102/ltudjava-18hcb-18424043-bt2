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
public class LopKhoaBieuDAO {
    
    
    
     public  List<Lopkhoabieu>  getALL()
    {
        
        List<Lopkhoabieu> list = new ArrayList<Lopkhoabieu>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Lopkhoabieu";
                Query query = session.createQuery(hql);
                list = query.list();
        } catch (Exception e) {
            return null;
        }
        finally
        {
            session.close();
        }
        
        
        return list;
          
     }
    
    
    public  Boolean KiemTraTrung(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Lopkhoabieu where maLopKhoaBieu = :ID ";
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


    public  void  Them(Lopkhoabieu item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getMaLopKhoaBieu());
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
    
}
