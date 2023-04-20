package com.groupeisi.schoolejb.dao;

import javax.ejb.Stateless;

import com.groupeisi.schoolejb.dao.ICourses;
import com.groupeisi.schoolejb.dao.RepositoryImpl;
import com.groupeisi.schoolejb.entities.Courses;

@Stateless
public class ICoursesImpl extends RepositoryImpl<Courses> implements ICourses {

}
