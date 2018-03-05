package DBUtils;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static{
		try {
			InputStream inputStream = DbUtils.class.getClassLoader().getResourceAsStream("db.properties");
			Properties prop =new Properties();
			prop.load(inputStream);
			
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			System.out.println(driver);
			//加载驱动
			Class.forName(driver);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	
	/**
	 * 创建连接
	 * @return
	 */
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 释放资源
	 * @param con
	 * @param sm
	 * @param rs
	 */
	public static void release(Connection con,Statement sm,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs=null;
		}
		
		if(sm!=null){
			try {
				sm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

