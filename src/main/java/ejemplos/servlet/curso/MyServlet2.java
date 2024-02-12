package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {
		public void doPost(HttpServletRequest request, HttpServletResponse response)// Implementa solicitudes post
				throws IOException, ServletException {

			PrintWriter out = response.getWriter();
    		out.println("<body>");
            out.println("<h2>Bienvenido " + request.getParameter("fname") + " " + request.getParameter("lname") + "</h2>");
    		out.println("</body>");
			out.println("</html>");


		}
}