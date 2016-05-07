package com.dinacs.warehouse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dinacs.warehouse.model.DwmModel;

public class DwmDAO {
	String driver = "com.mysql.jdbc.Driver";
	List<DwmModel> dmwList = new ArrayList<DwmModel>();


	public void createItem(DwmModel dmwModelObj) {
		
		

		try {
			Class.forName(driver);

			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dwm-db", "root",
					"root");

			Statement st = con.createStatement();

			String sql = "INSERT INTO warehouse " + "VALUES ('" + dmwModelObj.getItemid() + "','" + dmwModelObj.getItemname() + "','"
							+ dmwModelObj.getQty() + "','" + dmwModelObj.getMrp() + "','" + dmwModelObj.getTotal() + "')";
		
			System.out.println("Myquery" + sql);

			st.execute(sql);

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<DwmModel> getproductItems() {
		try {
			Class.forName(driver);

			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dwm-db", "root",
					"root");

			Statement st = con.createStatement();
			String sql = "SELECT * FROM WAREHOUSE ";
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				DwmModel dmwMdlObj = new DwmModel();

				String itemid = rs.getString(1);
				String itemname = rs.getString(2);
				String itemqty = rs.getString(3);
				String itemmrp = rs.getString(4);
				String totalcost = rs.getString(5);
				
				dmwMdlObj.setItemid(itemid);
				dmwMdlObj.setItemname(itemname);
				dmwMdlObj.setQty(itemqty);
				dmwMdlObj.setMrp(itemmrp);
				dmwMdlObj.setTotal(totalcost);
				
				dmwList.add(dmwMdlObj);

			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return dmwList;
	}

	

	
	}
			
	

