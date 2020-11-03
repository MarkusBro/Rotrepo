package servlets;

import models.UserInfoModel;
import tools.repository.ClassRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;

@WebServlet(name = "adduser", urlPatterns = {"/AddUser"})
public class AddUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        String email = req.getParameter("email");
        String passord = req.getParameter("passord");
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String date = req.getParameter("dob");
        String bio = req.getParameter("bio");
        String userType = req.getParameter("usertype");
        String className = req.getParameter("klasse");
        String club = req.getParameter("klubb");

        System.out.println(email + passord + firstName + lastName +
                date + bio + userType + className + club);
        UserInfoModel reqAddUserInfo = new UserInfoModel(email, passord, firstName, lastName,
                date, bio,userType, className, club);
        ClassRepository.addUser(reqAddUserInfo);
        req.getRequestDispatcher("StartSide.jsp").forward(req, resp);


    }
}

