package com.klu.insert;
import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.klu.bean.studentbean;
import co.klu.connections.DBUtil ;

import co.klu.connections.DBUtil;

public class studentinsertion {
	static Scanner s =new Scanner(System.in);
	public int Insert(studentbean gb) throws ClassNotFoundException,SQLException
	{
		System.out.println("Groceries are added into the list");
		Connection con=DBUtil.DBConnection();
		PreparedStatement st1=con.prepareStatement("insert into Groceries values(?,?,?)");
		st1.setInt(1,gb.getItemid());
		st1.setString(2, gb.getItemname());
		st1.setInt(3, gb.getCost());
		int i=st1.executeUpdate();
		con.close();
		return i;
	}
	public void Display() throws ClassNotFoundException, SQLException
	{
		System.out.println("     GROCERIES LIST         ");
		Connection con=DBUtil.DBConnection();
		PreparedStatement st1=con.prepareStatement("Select * from Groceries");
		ResultSet rs =st1.executeQuery();
		System.out.println("ITEMID\t\tITEMNAME\t\tITEMCOST");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
		}
		con.close();
		}
	public int TotalCost() throws ClassNotFoundException, SQLException
	{
		Connection con=DBUtil.DBConnection();
		PreparedStatement st1=con.prepareStatement("Select sum(cost) from Groceries");
		ResultSet rs=st1.executeQuery();
		while(rs.next()) {
			System.out.println("Total cost of all items:- "+rs.getInt(1)+" Rupees");
		}
	int i=st1.executeUpdate();
	con.close();
	return i;
		}
	 
		 
	
}
