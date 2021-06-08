package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/livros")
public class LivrosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//tutulo
		if(req.getParameter("titulo") == null) {
			System.out.println("Nunca nem vi");
		}else {
			String titulo = req.getParameter("titulo");
			System.out.println(titulo);
		}
		
		//ano
		if(req.getParameter("ano") == null) {
			System.out.println("Período do espaço-tempo");
		}else {
			String ano = req.getParameter("ano");
			System.out.println(ano);
		}
		
		//autor
		if(req.getParameter("autor") == null) {
			System.out.println("No conosso ninguem");
		}else {
			String autor = req.getParameter("autor");
			System.out.println(autor);
		}
	
	}
	
}
