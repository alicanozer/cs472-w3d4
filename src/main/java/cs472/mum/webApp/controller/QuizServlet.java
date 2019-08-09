package cs472.mum.webApp.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Quiz")
public class QuizServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
/*
    private Operation generateNewQuestion(){
        Random r = new Random();
        switch (r.nextInt(3)){
            case 0:
                return new Operation(r.nextInt(100)+1, Operator.SUM,r.nextInt(100)+1);
            case 1:
                return new Operation(r.nextInt(100)+1,Operator.MIN,r.nextInt(100)+1);
            case 2:
                return new Operation(r.nextInt(10)+1,Operator.MULTIPLY,r.nextInt(10)+1);
            case 3:
                return new Operation(r.nextInt(10)+1,Operator.POW,r.nextInt(10)+1);
        }

        return null;
    }
/*
    private List<Question> generateQuestions(){
        List<Question> ops = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            ops.add(new Question(r.nextInt(100)+1, Operator.SUM,r.nextInt(100)+1));
            ops.add(new Question(r.nextInt(100)+1,Operator.MIN,r.nextInt(100)+1));
            ops.add(new Question(r.nextInt(10)+1,Operator.MUL,r.nextInt(10)+1));
            ops.add(new Question(r.nextInt(10)+1,Operator.POW,r.nextInt(10)+1));
        }

        return ops;
    }
*/

}
