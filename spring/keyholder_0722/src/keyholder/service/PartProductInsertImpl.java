package keyholder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import keyholder.dao.PartDao;
import keyholder.dao.ProductDao;
import keyholder.vo.PartVO;
import keyholder.vo.ProductVO;

@Service("partProductInsert")
public class PartProductInsertImpl implements PartProductInsert {
	@Autowired
	private ProductDao productDao;
	@Autowired
	private PartDao partDao;
	
	@Transactional
	@Override
	public void execute(String partName, String productName, int productPrice) throws Exception {
		PartVO part = new PartVO();
		part.setPartName(partName);
		partDao.insert(part);
		
		
		ProductVO product = new ProductVO();
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		product.setPartId(part.getPartId());
		//product.setPartId(20);
		productDao.insert(product);
		
		System.out.println(part);
		System.out.println(product);
	}

}
