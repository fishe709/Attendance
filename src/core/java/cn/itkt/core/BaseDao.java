package cn.itkt.core;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
 /*
   private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
 
 private static final String URL = "jdbc:oracle:thin:@localhost:1521:db_oracle";

 private static final String UNAME = "accp";

 private static final String UPWD = "accp";
 */
 
 private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
 
 private static final String URL = "jdbc:oracle:thin:@192.168.0.157:1521:eqijshy";

 private static final String UNAME = "erijshy";

 private static final String UPWD = "eqijshy";

 protected Connection con;

 protected PreparedStatement pstm;

 protected ResultSet rs; 
  
 public void getConnection() throws Exception {
  Class.forName(DRIVER);
  con = DriverManager.getConnection(URL,UNAME,UPWD);
  
  System.out.println("数据库连接成功！");
 }

 public void closeAll() {
  if (rs != null) {
   try {
    rs.close();
   } catch (SQLException e) {
    e.printStackTrace();
   }
  }
  if (pstm != null) {
   try {
    pstm.close();
   } catch (SQLException e) {
    e.printStackTrace();
   }
  }
  try {
   if (con != null && con.isClosed() == false) {
    con.close();
   }
  } catch (SQLException e) {
   e.printStackTrace();
  }
 }
 
 public static void main(String[] args){
  BaseDao baseDAO = new BaseDao();
  try {
   baseDAO.getConnection();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
 
}