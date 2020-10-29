package servlets;

import tools.DbTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public boolean checklogin (String username, String password) throws SQLException,
            ClassNotFoundException{
        Connection conn =DbTool.getINSTANCE().dbLoggIn();

        String sql = "SELECT * FROM roklubb.userInfo WHERE email = ?  and password = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet result = statement.executeQuery();

        if (result.next()) {
            conn.close();
            return true;
        } else {
            conn.close();
            return false;
        }

    }
}


