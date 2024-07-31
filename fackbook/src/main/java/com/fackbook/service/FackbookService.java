package com.fackbook.service;

import com.fackbook.dao.FackbookDAO;
import com.fackbook.dao.FackbookDAOInterface;
import com.fackbook.entity.Facebookuser;

public class FackbookService implements FackbookServiceInterface {

	@Override
	public int createProfileService(Facebookuser fu) {
		
		FackbookDAOInterface fd=new FackbookDAO();
		int i=fd.createProfileDAO(fu);
		return i;
	}

}
