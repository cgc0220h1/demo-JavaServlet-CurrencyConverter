import java.io.IOException;
import java.io.PrintWriter;

/*
 * @project demo-JavaServlet-CurrencyConverter
 * @author Duc on 5/13/2020
 */
@javax.servlet.annotation.WebServlet(name = "ServletCalculator", urlPatterns = "/result")
public class ServletCalculator extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println(request);
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        printWriter.write("<h1>Rate: " + rate + "</h1>");
        printWriter.write("<h1>USD: " + usd + "</h1>");
        printWriter.write("<h1>VND: " + vnd + "</h1>");
        printWriter.write("</html>");
    }
}
