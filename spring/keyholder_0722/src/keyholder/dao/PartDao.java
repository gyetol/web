package keyholder.dao;

import keyholder.exception.PartException;
import keyholder.vo.PartVO;

public interface PartDao {
	void insert(PartVO part) throws PartException; 
	void update(PartVO part) throws PartException;
	void delete(int id) throws PartException;
	PartVO selectById(int id) throws PartException;
	PartVO selectByName(String name) throws PartException;
}
