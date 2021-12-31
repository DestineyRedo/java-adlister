import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessLossServlet", urlPatterns = "/incorrect")
public class GuessLossServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String outcome = "Winner";

        req.setAttribute("outcome", outcome);
        req.getRequestDispatcher("/guessOutcome.jsp").forward(req, res);
    }
}
