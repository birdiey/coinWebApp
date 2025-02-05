package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.GuessGenerator;
import za.ac.tut.business.TossProcessor;

public class TossServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //extract toss
        String tossValue = request.getParameter("toss");

        //do something with the data
        GuessGenerator gg = new GuessGenerator();
        String guessValue = gg.generateGuess();

        TossProcessor tp = new TossProcessor();
        String outcome = tp.determineOutcome(tossValue, guessValue);

        //forwad data to JSP for display
        request.setAttribute("tossValue", tossValue);
        request.setAttribute("guessValue", guessValue);
        request.setAttribute("outcome", outcome);
        
        RequestDispatcher disp =request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);

    }

}
