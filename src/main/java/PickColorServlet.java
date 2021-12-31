import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("pickcolor.jsp").forward(req, res); //doGet gets data from client where dispatcher forwards or includes response in servlet
    } //Defines an object that receives requests from the client and sends them to any resource (such as a servlet, HTML file, or JSP file) on the server.

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String color = req.getParameter("color");
        res.sendRedirect("/viewcolor?color=" + color);
    }
}
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("pickcolor.jsp").forward(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String color = request.getParameter("color");
//        response.sendRedirect("/viewcolor?color=" + color);
//
//    }