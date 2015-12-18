package ch.makery.address.model;

import domain.RateDomainModel;
import org.apache.poi.ss.formula.functions.FinanceLib;
import java.lang.Object;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Rate extends RateDomainModel {
	
	public double getPayment(int NumberOfPayments)
	{
		
		//FinalExam
		//	Normally this kind of method would be in a BLL, but alas...
		
		//	Figure out payment based on:
		//	Interest rate
		//	PV
		//	FV (make FV = 0, unless you want a balloon payment
		//	Compounding = True
		//	Number of Payments (passed in)
		
		return 0;
	}
	private static double pmt(double r, double n, double p, double f, boolean t) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		return 0;
	}
}
