import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessNumberServlet", urlPatterns = "/guess")
public class GuessNumberServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Random random = new Random();
        int randomNum = random.nextInt(3) + 1;
        System.out.println("Random number: " + randomNum);

        int number = Integer.parseInt(req.getParameter("number"));
        System.out.println("number");

        if(number == randomNum){
            res.sendRedirect("/correct.jsp");
        } else {
            res.sendRedirect("/incorrect.jsp");
        }
    }
}
