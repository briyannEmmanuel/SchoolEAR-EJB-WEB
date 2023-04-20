package com.groupeisi.schoolejb.dao;

import javax.ejb.Local;

import com.groupeisi.schoolejb.dao.Repository;
import com.groupeisi.schoolejb.entities.Student;

@Local
public interface IStudent extends Repository<Student>{

}
