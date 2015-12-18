package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.poi.ss.formula.functions.Rate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import util.HibernateUtil;

public class RateDAL {
	
	
	public static double getRate(int GivenCreditScore) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction get = null;
		RateDomainModel rateGet = null;
		
		try {
			get = session.beginTransaction();
			get.commit();
		}
		catch (HibernateException e) {
			if (get != null)
				get.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return 0;
	}
	public static RateDomainModel addRate(RateDomainModel rate) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction add = null;
		int FV = 0;
		try {
			add = session.beginTransaction();
			session.save(rate);
			add.commit();
		} catch (HibernateException e) {
			if (add != null)
				add.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rate;
	}
	
	public static RateDomainModel updateRate(RateDomainModel rate) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction update = null;
		RateDomainModel rateGet = null;		
		
		try {
			update = session.beginTransaction();	
									
			session.update(rate);
	
			
			update.commit();
		} catch (HibernateException e) {
			if (update != null)
				update.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rate;
	}		
}