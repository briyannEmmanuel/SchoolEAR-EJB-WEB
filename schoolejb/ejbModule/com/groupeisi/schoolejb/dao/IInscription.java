package com.groupeisi.schoolejb.dao;

import javax.ejb.Local;

import com.groupeisi.schoolejb.dao.Repository;
import com.groupeisi.schoolejb.entities.Inscription;

@Local
public interface IInscription extends Repository<Inscription>{

	//public Inscription getConnection(String email, String password);
}
