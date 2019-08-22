/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.DAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javaapplication1.HibernateUtil;
import javaapplication1.Pojo.*;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Asus
 */
public class PhucKhaoDiemDAO {
    
     
    
    
    
    
    
    public  Phuckhao getByLast(String ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Phuckhao tk = new Phuckhao( );
        try {
            String hql = "From Phuckhao where id = :ID";
                Query query = session.createQuery(hql);
                
                tk = (Phuckhao)query.list().get(query.list().size()-1);
               
            
        } catch (Exception e) 
        {
            return null;
        }
        finally
        {
            session.close();
            
             return  tk;
        
        }
      
        
          
    }
    
    
     public  List<Phuckhao> getALL()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
       
        List<Phuckhao> listpk = new ArrayList<Phuckhao>();
        
        
        try {
            String hql = "From Phuckhao";
                Query query = session.createQuery(hql);
                
                listpk = query.list();
               
            
        } catch (Exception e) 
        {
            return null;
        }
        finally
        {
            session.close();
            
             return  listpk;
        
        }
      
        
          
    }
     
     
       public  Phuckhao TimKiem(String mapk,Date ngaybd,Date ngaykt,String mssv)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
       
        List<Phuckhao> listpk = new ArrayList<Phuckhao>();
         Phuckhao pk = new Phuckhao();
        
        try {
            String hql = "From Phuckhao";
                Query query = session.createQuery(hql);
                
                listpk = query.list();
               
                for(Phuckhao item :listpk)
                {
                    Phuckhao p =listpk.get(listpk.size()-1);
                       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date datebd = sdf.parse(item.getId().getNgayBd().toString());
                        Date datekt = sdf.parse(item.getId().getNgayKt().toString());
                    if(item.getId().getMaPhucKhao().equals(mapk) && item.getId().getMssv().equals(mssv) && datebd.compareTo(ngaybd)==0 && datekt.compareTo(ngaykt)==0)
                    {
                        pk=item;
                        return  pk;
                    }
                }
            
        } catch (Exception e) 
        {
            return null;
        }
        finally
        {
            session.close();
            return  pk;
            
       
        
        }
    }  
        
         public  List<Phuckhao> XemPhucKhao(Date ngaybd,Date ngaykt)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
       
        List<Phuckhao> listpk = new ArrayList<Phuckhao>();
        List<Phuckhao> listthem = new ArrayList<Phuckhao>();
         Phuckhao pk = new Phuckhao();
        
        try {
            String hql = "From Phuckhao";
                Query query = session.createQuery(hql);
                
                listpk = query.list();
               
                for(Phuckhao item :listpk)
                {
                    Phuckhao p =listpk.get(listpk.size()-1);
                       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date datebd = sdf.parse(item.getId().getNgayBd().toString());
                        Date datekt = sdf.parse(item.getId().getNgayKt().toString());
                    if( ngaybd.compareTo(datebd) <=0 && ngaykt.compareTo(datekt) >=0)
                    {
                        listthem.add(item);
                        
                    }
                }
            
        } catch (Exception e) 
        {
            return null;
        }
        finally
        {
            session.close();
            return  listthem;
            
       
        
        }
      
 
      
        
          
    }
    
    
    
    public  Boolean KiemTraTrung(PhuckhaoId ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Phuckhao where id = :ID";
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
    
    
    
        public  Boolean KiemTraTrungSinhvien(PhuckhaoId ID,String MSSV)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            String hql = "From Phuckhao where id = :ID and mssv = :mssv";
                Query query = session.createQuery(hql);
                query.setParameter("ID", ID);
                query.setParameter("mssv", MSSV);
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
    
    
    
    
        public  Phuckhao TonTai()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Phuckhao tk = new Phuckhao();
        try {
            Date date = new Date();
            String hql = "From Phuckhao ";
                Query query = session.createQuery(hql);
             
                
             
                List<Phuckhao> listpk = query.list();
                if(listpk.size()>0)
                {
                    Phuckhao p =listpk.get(listpk.size()-1);
                       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date datebd = sdf.parse(p.getId().getNgayBd().toString());
                        Date datekt = sdf.parse(p.getId().getNgayKt().toString());
                    if(  date.compareTo(datebd) >= 0 &&date.compareTo(datekt)<= 0 )        
                    {
                        return p;
                    }
                }
                return tk;
                
                
            
        } catch (Exception e) 
        {
            return null;
        }
        finally
        {
            session.close();
            
     
        
        }
      
        
          
    }
    
    
  public  void  ThemChoGiaoVu(Phuckhao item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getId());
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
  
    
    


    public  void  ThemChoSinhVien(Phuckhao item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung   = KiemTraTrungSinhvien(item.getId(),item.getId().getMssv());
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
    
    
    public  void  Sua(Phuckhao item)
    {
        
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        boolean kqtrung= KiemTraTrung(item.getId());
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
    
}
