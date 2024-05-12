import java.sql.*;

public class Administrator {
    private String username;
    private String password;


    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void addUser(String newUsername, String newPassword, String role ){
        String sql = "INSERT INTO users (username, password,role) VALUES (?,?,?)";
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newUsername);
            pstmt.setString(2,newPassword);
            pstmt.setString(3,role);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
