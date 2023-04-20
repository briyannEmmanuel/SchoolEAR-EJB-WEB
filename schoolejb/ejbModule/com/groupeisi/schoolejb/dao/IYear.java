package com.groupeisi.schoolejb.dao;

import javax.ejb.Local;

import com.groupeisi.schoolejb.dao.Repository;
import com.groupeisi.schoolejb.entities.Year;

@Local
public interface IYear extends Repository<Year> {

}
