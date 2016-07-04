package org.javachina.dynaform.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DynaActionForm dynaForm = (DynaActionForm)form;
		String userId = (String)dynaForm.get("userId");
		String pwd = (String)dynaForm.get("pwd");
		System.out.println(userId+":"+pwd);
		return null;
	}
	
}
