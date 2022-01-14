package com.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.common.Controller;

public class MemberListController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		req.setAttribute("id", id);
		req.setAttribute("pw", pw);
		
		
		//resp.sendRedirect("member/memberList.jsp");
		req.getRequestDispatcher("member/memberList.jsp").forward(req, resp);
	}

}
