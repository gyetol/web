package jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import jdbc.vo.PartVO;

@Component("PartDAO")
public class PartDAOImpl implements PartDAO {
	@Autowired
	private JdbcTemplate temp;
	
	/*
	 * public PartDAOImpl(DataSource datasource) { temp= new
	 * JdbcTemplate(datasource); }
	 */

	
	@Override
	public void insert(PartVO part) {
		//String sql= "INSERT INTO parts VALUES (default,'"+part.getPartName()+"')";
		String sql="INSERT INTO parts VALUES (default,?)"; 
		int result = temp.update(sql, part.getPartName());
		if(result>0) {
			System.out.println("등록성공");
		}
		else {
			System.out.println("등록실패");
		}
	}

	@Override
	public void update(PartVO part) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public PartVO selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PartVO> selectAll() {
		String sql = "select * from parts order by partId";
		List<PartVO> parts= temp.query(sql,new RowMapper<PartVO>() {

			@Override
			public PartVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				int partId = rs.getInt("partId");
				String partName= rs.getString("partName");
				PartVO part = new PartVO(partId,partName);
				return part;
				
			}
			
		});
		return parts;
	}

}
