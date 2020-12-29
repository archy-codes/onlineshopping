package archy.wiz.onlineshoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import archy.wiz.onlineshoppingbackend.dao.CategoryDAO;
import archy.wiz.onlineshoppingbackend.dto.Category;

public class CategoryTestCase {

	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("archy.wiz.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void CategoryTestAdd() {
		
		//adding a list of categories
		category = new Category();
		category.setName("Arts & Craft");
		assertEquals("you have successfully added Arts And Craft category" , true , categoryDAO.add(category));
		
		
		category = new Category();
		category.setName("Automative");
		assertEquals("you have successfully added a Automotive category", true , categoryDAO.add(category));
		
		category = new Category();
		category.setName("Baby");
		assertEquals("you have successfully added a baby category", true , categoryDAO.add(category));
		
		category = categoryDAO.get(3);
		category.setName("Beauty and Personal Care");
		assertEquals("you have successfully fetched and updated a category", true , categoryDAO.update(category));
		
		
		//deleting the category
		assertEquals("you have successfully deleted a category", true , categoryDAO.delete(category));
		
		//fetching the list of categories
		assertEquals("you have successfully fetched a list of categories",3,categoryDAO.listcategories().size());
		
		//fetching the list of active categories\
		assertEquals("you have successfully fetched a list of active categories",2 , categoryDAO.listActiveCategories().size());
		
	}
	
}
