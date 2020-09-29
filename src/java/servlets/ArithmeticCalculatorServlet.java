package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("message", "Result: ---");

        String first = request.getParameter("first_");
        String second = request.getParameter("second_");
        String action = request.getParameter("cal");

        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        try {
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            if (first == null || first.equals("") || second == null || second.equals("")) {
                request.setAttribute("message", "Result: invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            } else if (action.equals("+")) {
                request.setAttribute("message", "Result: " + (firstNum + secondNum));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            } else if (action.equals("-")) {
                request.setAttribute("message", "Result: " + (firstNum - secondNum));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            } else if (action.equals("*")) {
                request.setAttribute("message", "Result: " + (firstNum * secondNum));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            } else if (action.equals("%")) {
                request.setAttribute("message", "Result: " + (firstNum / secondNum));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }

        } catch (NumberFormatException e) {
            request.setAttribute("message", "Result: invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }

    }
}
