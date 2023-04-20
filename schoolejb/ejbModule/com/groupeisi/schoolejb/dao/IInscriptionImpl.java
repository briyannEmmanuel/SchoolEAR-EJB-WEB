package com.groupeisi.schoolejb.dao;

import javax.ejb.Stateless;

import com.groupeisi.schoolejb.dao.IInscription;
import com.groupeisi.schoolejb.dao.RepositoryImpl;
import com.groupeisi.schoolejb.entities.Inscription;

@Stateless
public class IInscriptionImpl extends RepositoryImpl<Inscription> implements IInscription {

}
