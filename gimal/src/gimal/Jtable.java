package gimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;

public class Jtable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Sed25890!";
        
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("MySQL에 성공적으로 연결되었습니다.");
        } catch (SQLException e) {
            System.out.println("MySQL 연결 실패: " + e.getMessage());
        }
        
        JFrame frame = new JFrame("동현이의 맛집 추천 테이블");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        DefaultTableModel tableModel = new DefaultTableModel(
                new String[]{"메뉴명", "가격", "칼로리", "탄수화물", "단백질", "지방"},
                0
        );
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM momstouch")) {

               // 데이터베이스에서 데이터 가져와 JTable에 추가
               while (rs.next()) {
            	   String name = rs.getString("name");
                   int price = rs.getInt("price");
                   int calor = rs.getInt("calorie");
                   int carbs = rs.getInt("carbs");
                   int protein = rs.getInt("protein");
                   int fat = rs.getInt("fat");
                   
                   tableModel.addRow(new Object[]{name, price, calor, carbs, protein, fat});
               }

           } catch (SQLException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(frame, "Error connecting to database: " + e.getMessage(),
                       "Database Error", JOptionPane.ERROR_MESSAGE);
           }

           // 프레임 표시
           frame.setVisible(true);
    }
}
