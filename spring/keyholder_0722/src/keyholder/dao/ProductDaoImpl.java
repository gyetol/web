package keyholder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import keyholder.vo.ProductVO;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jTemp;
	
	@Override
	public void insert(ProductVO product) throws Exception {
		KeyHolder holder= new GeneratedKeyHolder();
		final String[] columns = {"productId"};
		int result = jTemp.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into products values (default,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql,columns);
				pstmt.setString(1,product.getProductName());
				pstmt.setInt(2, product.getProductPrice());
				pstmt.setInt(3, product.getPartId());
				return pstmt;
			}
			
		},holder);
		if(result==0) {
			throw new Exception("��ǰ��Ͽ� �����Ͽ����ϴ�.");
		}
		Number number = holder.getKey();
		int productId = number.intValue();
		product.setProductId(productId);
	}

}
