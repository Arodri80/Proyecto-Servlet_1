package ejemplos.servlet.curso;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/myServlet2")

public class MyServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Implementa el manejo de solicitudes GET aquí si es necesario
		processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Implementa el manejo de solicitudes POST aquí
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Procesa la solicitud
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");

		// Configura los nombres para pasarlos a form2.jsp
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);

		// Envia a form2.jsp
		RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("/jsp/form2.jsp");
        dispatcher.forward(request, response);
	}
}