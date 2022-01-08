package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    private static Connection conn;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + " database = QLBH; integratedSecurity = true; "
                    + "username = sa; password = 123456");
                    
            if(conn != null){
                //System.out.println("Kết nối thành công!");
                return conn;
            }
        } catch (Exception e) {
            System.out.println("Kết nối không thành công! Error: " + e.toString());
        }
        return null;
    }
}
