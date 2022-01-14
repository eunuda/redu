package com.edu.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.common.Controller;
import com.edu.dao.CommentDAO;
import com.edu.model.CommentVO;

public class CommentListController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CommentDAO dao = new CommentDAO();

		List<CommentVO> list = dao.selectAll();
		req.setAttribute("commentList", list);

		RequestDispatcher rs = req.getRequestDispatcher("comment/commentList.jsp");
		rs.forward(req, resp);

	}

}
