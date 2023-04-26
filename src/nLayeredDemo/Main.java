package nLayeredDemo;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;

public class Main {

	public static void main(String[] args) {
		IProductService productService = new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
		
		Product product1 = new Product(1,2,"Elma",12,50);
		productService.add(product1);
	}
}
