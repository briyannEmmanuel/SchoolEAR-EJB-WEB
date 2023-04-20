package com.groupeisi.schoolejb.dao;

import javax.ejb.Stateless;

import com.groupeisi.schoolejb.dao.IStudent;
import com.groupeisi.schoolejb.dao.RepositoryImpl;
import com.groupeisi.schoolejb.entities.Student;

@Stateless
public class IStudentImpl extends RepositoryImpl<Student> implements IStudent {

	/*@PersistenceContext(unitName="schoolejb")
	protected EntityManager em;
	
	public Student getConnection(String firtsname, String lastname) {
		
		return (Student) em.createQuery("SELECT ing FROM Ingenieur ing WHERE ing.email=:email AND ing.password=:password")
				.setParameter("firtsname", firtsname)
				.setParameter("lastname", lastname)
				.getSingleResult();
	}*/
}
