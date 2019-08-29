package be.intecBrussel.webcomponents;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/helloWorldServlet")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{
        System.out.println("Hello server, I am a little message, congrats on finding me");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                out.println("<head>");
                     out.println("<title>HelloWorldServlet</title>");
                out.println("</head>");

                out.println("<body>");
                    out.println("<h1>");
                         out.println("HELLO WORLD this is Servlet");
                    out.println("</h1>");
                out.println("</body>");
            out.println("</html>");


        }catch (Exception ex){
            ex.getCause();
        }

    }
}
