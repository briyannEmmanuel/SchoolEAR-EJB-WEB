package com.groupeisi.schoolejb.dao;

import javax.ejb.Stateless;

import com.groupeisi.schoolejb.dao.IYear;
import com.groupeisi.schoolejb.dao.RepositoryImpl;
import com.groupeisi.schoolejb.entities.Year;

@Stateless
public class IYearImpl extends RepositoryImpl<Year> implements IYear {

}
