package keyholder.service;

import keyholder.vo.PartVO;

public interface PartProductInsert {
	void execute(String partName, String productName,int productPrice) throws Exception;
	
}
