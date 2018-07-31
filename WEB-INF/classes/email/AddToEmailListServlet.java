package email;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class AddToEmailListServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        out.println("<p>Secret: </p>");
        out.close();
    }
}
