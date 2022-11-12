import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String id=req.getParameter("id");
		int id2=Integer.parseInt(id);
		
		Model m=UserDao.getElementById(id2);
			
		out.print("<form action='EditServlet2' method ='POST' >");
		
		out.print("<table border='1'>");
		
		out.print("<tr><td colspan=2><input type='hidden' name='id' value='"+m.getId()+"'></td></tr>");
		
		out.print("<tr><td>Your FirstName: </td><td><input type='text' name='name' value='"+m.getFname()+"'></td></tr>");
		
		out.print("<tr><td>Your Lastname: </td><td><input type='text' name='surname' value='"+m.getLname()+"'></td></tr>");
		
		out.print("<tr><td>Your Email: </td><td><input type='email' name='email' value='"+m.getEmail()+"'></td></tr>");
		
		out.print("<tr><td> Your Password: </td><td><input type='password' name='password' value='"+m.getPass()+"'></td></tr>");
		
		out.print("<tr><td colspan=2 align='center'><input type='submit' value='Update' ></td></tr>");
		out.print("</table>");
		out.print("</form>");
	}
}
