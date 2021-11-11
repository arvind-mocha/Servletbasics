package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewApi", value = "/NewApi")
public class NewApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getAttribute("error") == null) {
            String firstname = (String) request.getAttribute("firstName");
            String lastname = (String) request.getAttribute("lastName");
            getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
        }else{
            System.out.println("No valid parameter provided");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
