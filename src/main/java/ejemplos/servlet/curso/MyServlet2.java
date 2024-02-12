package ejemplos.servlet.curso;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {
		public void doPost(HttpServletRequest request, HttpServletResponse response)// Implementa solicitudes post
			throws IOException {
		// obtener los parámetros del formulario y escribir la respuesta
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Bienvenido " + firstName + " " + lastName + "</h2>");
		out.println("</body></html>");
	}
}