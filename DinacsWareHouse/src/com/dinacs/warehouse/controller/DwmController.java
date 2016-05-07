package com.dinacs.warehouse.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dinacs.warehouse.model.DwmModel;
import com.dinacs.warehouse.service.DwmService;

public class DwmController<E> extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String warehouseAction = req.getParameter("warehouseAction");

		System.out.println("action is" + warehouseAction);
		if ("getAllItems".equalsIgnoreCase(warehouseAction)) {

			System.out.println("calling doGet method");

			DwmService DwmServiceObj = new DwmService();
			List<DwmModel> availableItemList = DwmServiceObj.getproductItems();
			req.setAttribute("availableItemList", availableItemList);
			RequestDispatcher rd = req.getRequestDispatcher("/availableitems.jsp");
			rd.forward(req, resp);
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String warehouseAction = req.getParameter("warehouseAction");

		if ("createItem".equalsIgnoreCase(warehouseAction)) {

			String itemid = req.getParameter("itemid");
			String itemname = req.getParameter("itemname");
			String itemqty = req.getParameter("itemqty");
			String itemmrp = req.getParameter("itemmrp");
			String totalcost = req.getParameter("totalcost");

			DwmModel dmwModelObj = new DwmModel();

			dmwModelObj.setItemid(itemid);

			dmwModelObj.setItemname(itemname);

			dmwModelObj.setQty(itemqty);
			dmwModelObj.setMrp(itemmrp);
			dmwModelObj.setTotal(totalcost);

			DwmService<Object> dwmServiceObj = new DwmService<Object>();
			dwmServiceObj.createItem(dmwModelObj);

			resp.sendRedirect("home.jsp");

		}

	}

}
