package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.core.ILoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements IProductService{
	//private IProductDao productDao; bunu yapma sebebimizi unutma kodları gevşek bağlama amacındayız.
	private IProductDao productDao;
	private ILoggerService loggerService;
	
	public ProductManager(IProductDao productDao, ILoggerService loggerService) {
		super();
		this.loggerService = loggerService;
		this.productDao = productDao;
		
	}

	public ProductManager(IProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		//iş kodları
		if (product.getCategoryId() ==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
			}
			productDao.add(product);
			loggerService.logToSystem("Ürün eklendi: " + product.getName());
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
