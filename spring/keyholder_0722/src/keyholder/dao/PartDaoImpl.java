package keyholder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import keyholder.exception.PartException;
import keyholder.exception.PartInputException;
import keyholder.pstmt.PartInsertCreator;
import keyholder.vo.PartVO;

@Repository("partDao")
public class PartDaoImpl implements PartDao {
	@Autowired
	private JdbcTemplate jTemp;

	@Override
	public void insert(PartVO part) throws PartException {
		String sql="insert into parts(partName) values (?)";
		KeyHolder holder = new GeneratedKeyHolder();
		String[] columns = {"partId"};
		int result = jTemp.update(new PartInsertCreator(part,columns),holder);
		
		
		
		if(result ==0) {
			throw new PartInputException();
		}
		Number number = holder.getKey();
		int partId = number.intValue();
		part.setPartId(partId);
	}

	@Override
	public void update(PartVO part) throws PartException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws PartException {
		// TODO Auto-generated method stub

	}

	@Override
	public PartVO selectById(int id) throws PartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PartVO selectByName(String name) throws PartException {
		// TODO Auto-generated method stub
		return null;
	}

}
