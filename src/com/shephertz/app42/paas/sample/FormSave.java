package com.shephertz.app42.paas.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shephertz.app42.paas.sample.db.DBManager;

/**
 * Servlet implementation class FormSave
 */
public class FormSave extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormSave() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String description = request.getParameter("description");

		try {
			DBManager.insert(name, email, description);

			String newUrl = "http://" + request.getServerName() + ":"
					+ request.getServerPort() + request.getContextPath()
					+ "/home";

			response.setStatus(response.SC_MOVED_PERMANENTLY);
			response.setHeader("Location", newUrl);
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<!doctype html><html><head><meta charset='utf-8'><title>App42 Sample Java-Couch Application</title><link href='css/style-User-Input-Form.css' rel='stylesheet' type='text/css'></head><body><div class='App42PaaS_header_wrapper'><div class='App42PaaS_header_inner'><div class='App42PaaS_header'><div class='logo'><a href='http://app42paas.shephertz.com'><img border='0' alt='App42PaaS' src='images/logo.png'></img></a></div></div></div></div><div class='App42PaaS_body_wrapper'><div class='App42PaaS_body'><div class='App42PaaS_body_inner'><div class='contactPage_title'>");
			out.print("<h2 align='center'>Error occured. See Logs.</h2><br/><br/>");
			out.print("<br/><a href='/' style='font-size: 18px;'>Back</a>");
			out.print("</div></div></div></div></body></html>");
		}

	}

}
