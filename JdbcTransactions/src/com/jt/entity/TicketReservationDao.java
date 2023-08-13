package com.jt.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketReservationDao {
public static void main(String[] args) throws Exception {
	Connection con=null;
	PreparedStatement selectPstm=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatedb", "root", "root");
		selectPstm=con.prepareStatement("select * from tickets_info where tripId=?");
		selectPstm.setInt(1, 1);
		ResultSet rs=selectPstm.executeQuery();
		while(rs.next()) {
			int availableTickets=rs.getInt(2)-rs.getInt(3);
			System.out.println(availableTickets);
		}
	}catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		throw e;
	}
		
	}
}

