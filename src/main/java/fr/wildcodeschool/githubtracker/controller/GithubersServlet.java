package fr.wildcodeschool.githubtracker.controller;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class GithubersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        Githuber githuber01 = new Githuber("Carton", "n.carton@natixis.com", "ncarton", "1" );
        Githuber githuber02 = new Githuber("Faivre", "c.faivre@natixis.com", "cfaivre", "2");
        Githuber githuber03 = new Githuber("Leveque", "s.leveque@natixis.com", "sleveque", "3");
        Githuber githuber04 = new Githuber("Caspani", "m.caspani@natixis.com", "mcaspani", "4");
        Githuber githuber05 = new Githuber("Markaoui", "h.markaoui@natixis.com", "hmarkaoui", "5");

        List<Githuber> githuberList = Arrays.asList(githuber01, githuber02, githuber03,githuber04,githuber05);

        req.setAttribute( "listGithuber", githuberList );
        this.getServletContext().getRequestDispatcher("/githubers.jsp").forward(req,resp);
    }
}
