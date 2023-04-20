package com.groupeisi.schoolejb.dao;

import javax.ejb.Local;

import com.groupeisi.schoolejb.dao.Repository;
import com.groupeisi.schoolejb.entities.Courses;

@Local
public interface ICourses extends Repository<Courses> {

}
