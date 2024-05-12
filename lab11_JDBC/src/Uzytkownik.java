import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Uzytkownik {

    private String username;
    private String password;

    public Uzytkownik(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void wplata(double amount ){
        String sql = "INSERT INTO transactions (account_id, type, amount) VALUES (?,'Wpłata',?)";
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,getAccountId());
            pstmt.setDouble(2,amount);
            pstmt.executeUpdate();
            System.out.println("Wpłata: "+ amount);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void wyplata(double amount){
        String sql = "INSERT INTO transactions (account_id,type,amount) VALUES (?,'Wypłata',?)";
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, getAccountId());
            pstmt.setDouble(2,amount);
            pstmt.executeUpdate();
            System.out.println("Wypłata: "+ amount);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void zmianaPinu(String newPin) {
        String sql = "UPDATE users SET password = ? WHERE username = ?";
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newPin);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
            System.out.println("Pin changed to: " + newPin);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sprawdzenieWyciagu() {
        String sql = "SELECT * FROM transactions WHERE account_id = ?";
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, getAccountId());
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Transaction ID: " + rs.getInt("transaction_id"));
                System.out.println("Type: " + rs.getString("type"));
                System.out.println("Amount: " + rs.getDouble("amount"));
                System.out.println("Timestamp: " + rs.getTimestamp("timestamp"));
                System.out.println("--------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    private int getAccountId() {
        String sql = "SELECT user_id FROM users WHere username = ?";
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return rs.getInt("user_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }


}
