import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessWinServlet", urlPatterns = "/correct" )
public class GuessWinServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String outcome = "Loser";
        req.setAttribute("outcome", outcome);
        req.getRequestDispatcher("/outcome.jsp").forward(req, res);
    }
}
