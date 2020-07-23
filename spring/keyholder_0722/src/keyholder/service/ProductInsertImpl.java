package keyholder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import keyholder.dao.ProductDao;
import keyholder.vo.ProductVO;

@Service("productInsert")
public class ProductInsertImpl implements ProductInsert {
	@Autowired
	private ProductDao dao;
	@Override
	public void execute(String productName, int productPrice, int partId) throws Exception {
		ProductVO product= new ProductVO();
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		product.setPartId(partId);
		dao.insert(product);
		System.out.println(product);
	}

}
