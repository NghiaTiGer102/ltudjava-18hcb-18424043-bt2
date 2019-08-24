/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.DAO;

import javaapplication1.HibernateUtil;
import javaapplication1.Pojo.Giaovu;
import javaapplication1.Pojo.Taikhoan;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Asus
 */
public class GiaoVuDAO {
    
    public Giaovu getByID(Giaovu gv)
    {
     
       
        Session session = HibernateUtil.getSessionFactory().openSession();
        Giaovu  gvre = new Giaovu();
        try {
            String hql = "From Giaovu where maGiaoVu = :maGiaoVu ";
                Query query = session.createQuery(hql);
                query.setParameter("maGiaoVu", gv.getMaGiaoVu());
              
                gvre = (Giaovu)query.list().get(0);
                
               
               return gvre;
                
                
        } catch (Exception e) {
            
              
               return null;
        }
        finally
        {
            session.close();
        }
        
        
       
    }
    
}
