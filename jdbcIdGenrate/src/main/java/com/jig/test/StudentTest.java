package com.jig.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentTest {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String sql="select max(student_id) from student";
	Connection con=null;
	Statement st=null;
	ResultSet data=null;
	PreparedStatement pstmt=null;
	int studentId=0;
	try {
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatedb", "root", "root");
 st=con.createStatement();

   data=st.executeQuery(sql);
 if( data.next()){
	 studentId=  data.getInt(1);
	System.out.println("Max studentId fromdb : "+studentId);
	studentId++;
  }
	System.out.println("After increasing count: "+studentId);
 String preSql="insert into student values(?,?,?,?,?,?,?,?) ";
   pstmt=con.prepareStatement(preSql);
   int genStudentId=studentId;
   pstmt.setInt(1, genStudentId);
   pstmt.setString(2, "Murali");
   pstmt.setString(3, "Subramanyam");
   pstmt.setInt(4, 23);
   pstmt.setString(5, "Male");
   pstmt.setString(6, "9490642337");
   pstmt.setString(7, "muralid@gmail.com");
   pstmt.setString(8, "Testing");
 int result=  pstmt.executeUpdate();
System.out.println("Number of records insert intodb: "+result);
	}catch(SQLException e){
		e.printStackTrace();
		throw e;
	}
	finally {
		if(con !=null) {
			con.close();
			con=null;
		}
	}
}
}
