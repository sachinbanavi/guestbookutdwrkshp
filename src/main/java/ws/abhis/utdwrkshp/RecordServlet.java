package ws.abhis.utdwrkshp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecordServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comment = request.getParameter("comment");
        
        Logger log = new Logger("comments.txt", 2);
        log.log(name + " " + email + " " + comment,2);
	}
}
