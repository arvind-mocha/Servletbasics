package servlets;

import model.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PersonServlet", value = "/PersonServlet")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstName");
        String lastname = request.getParameter("lastName");

        StringBuilder error = new StringBuilder();
        if(firstname == null){
            error.append("First Name Not Valid");
        }else if(lastname ==null) {
            error.append("Second Name Not Valid");
        }

        if(error.length() > 0){
            request.setAttribute("error", error.toString());
            request.setAttribute("person", new Person());
        }else{
            request.setAttribute("person", new Person(firstname, lastname));
        }

        getServletContext().getRequestDispatcher("/name.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
