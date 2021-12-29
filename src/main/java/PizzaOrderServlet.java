import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String crust = req.getParameter("crust");
        System.out.println("Pizza crust: " + crust);

        String sauce = req.getParameter("sauce");
        System.out.println("Sauce type :" + sauce);

        String size = req.getParameter("size");
        System.out.println("Pizza size: " + size);


        String[] toppings = req.getParameterValues("topping");
        for(String topping : toppings ){
            System.out.println(topping);
        }

        res.sendRedirect("/pizza-order");
    }
}


