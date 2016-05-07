package com.dinacs.warehouse.service;

import java.util.List;

import com.dinacs.warehouse.dao.DwmDAO;
import com.dinacs.warehouse.model.DwmModel;

public class DwmService<dmwList> {

	public void createItem(DwmModel dmwModelObj) {

		DwmDAO dwmDaoObj = new DwmDAO();

		dwmDaoObj.createItem(dmwModelObj);

	}

	public List<DwmModel> getproductItems() {
		DwmDAO dwmDaoObj = new DwmDAO();
		return dwmDaoObj.getproductItems();
	}

	public String deleteItem(String id) {
		DwmDAO dao = new DwmDAO();
		dao.deleteItem(id);
		
		return null;
	}

	public DwmModel getItemData(String id) {

		DwmDAO dao = new DwmDAO();
		 return dao.getItemData(id);
		
		
	}

	
	
}
