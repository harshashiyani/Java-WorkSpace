import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Savedata extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String password=req.getParameter("pass");
		
		System.out.println("Name:"+fname);
		System.out.println("Lastname:"+lname);
		System.out.println("Email Id:"+email);
		System.out.println("Mobile no:"+mobile);
		System.out.println("Gender:"+gender);
		System.out.println("Password:"+password);
		
	}
	

}
