package lab4.ex2;

import lab4.ex2.Product;

public class TxProductService {
	private ProductDao productDao;
	
	public void testTx(){
		Product p = productDao.getProduct(1);
		p.setName("myName-tx");
		productDao.update(p);
//		raiseException();
	}
	
	public void raiseException(){
		throw new RuntimeException();
	}
	public void setProduct(ProductDao productDao){
		this.productDao =productDao;
	}

}
