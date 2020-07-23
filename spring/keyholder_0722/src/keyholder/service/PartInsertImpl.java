package keyholder.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import keyholder.dao.PartDao;
import keyholder.exception.PartException;
import keyholder.vo.PartVO;

@Service("partInsert")
public class PartInsertImpl implements PartInsert {
	@Autowired
	private PartDao dao;

	@Override
	public void execute(String partName) throws PartException {
		PartVO part = new PartVO();
		part.setPartName(partName);
		dao.insert(part);
		System.out.println(part);
	}
	
	
}
