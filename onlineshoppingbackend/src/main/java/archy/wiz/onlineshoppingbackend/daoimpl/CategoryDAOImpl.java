package archy.wiz.onlineshoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import archy.wiz.onlineshoppingbackend.dao.CategoryDAO;
import archy.wiz.onlineshoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Category get(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public List<Category> listcategories() {
		return sessionFactory.getCurrentSession().createQuery("FROM Category",Category.class).getResultList();
	}

	@Override
	public List<Category> listActiveCategories() {
		return sessionFactory
				.getCurrentSession()
				  .createQuery("FROM Category WHERE active = :active", Category.class)
				     .setParameter("active", true)
				        .getResultList();
	}

	@Override
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
