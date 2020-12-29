package archy.wiz.onlineshoppingbackend.dao;

import java.util.List;

import archy.wiz.onlineshoppingbackend.dto.Category;

public interface CategoryDAO {
	Category get(int id);
	List<Category> listcategories();
	List<Category> listActiveCategories();
	
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
}
