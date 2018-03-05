package DAO;
import DBUtils.DbUtils;
import java.util.*;
import java.sql.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import DBUtils.DbUtils;
import bean.Emloyee;
import inf.DaoInf;

public class EmloyeeDAO implements DaoInf<Emloyee>{
	
	public EmloyeeDAO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean insertData(Emloyee data) {
		// TODO Auto-generated method stub
		ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		Connection con = DbUtils.getConnection();
		Statement sm=null;
		String sql =null;
		ResultSet rs=null;
		try {
			
			sm = con.createStatement();
			sql = "insert into information values("+data.getId()+","+data.getUsername()+","+data.getAge()+""
					+ ","+data.getSex()+","+data.getTitle()+","
					+data.getSection()+","
					+data.getSalary()+")";
			
			rs = sm.executeQuery(sql);
			while (rs.next()) {
				Emloyee tempEmloyee = new Emloyee();
				tempEmloyee.setId(rs.getInt(1));
				tempEmloyee.setUsername(rs.getString(2));
				tempEmloyee.setAge(rs.getInt(3));
				tempEmloyee.setSex(rs.getString(4));
				tempEmloyee.setTitle(rs.getString(5));
				tempEmloyee.setSection(rs.getString(6));
				tempEmloyee.setSalary(rs.getInt(7));
				list.add(tempEmloyee);				
			}	
			DbUtils.release(con, sm,rs);
			
		} catch (Exception e) {
			e.printStackTrace();
			DbUtils.release(con, sm, rs);
			return false;
		}		
		return true;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		Connection con = DbUtils.getConnection();
		java.sql.PreparedStatement sm=null;
		String sql =null;
		ResultSet rs =null;
		try {
			sql = "delete from information where id=?";
			sm = con.prepareStatement(sql);
			sm.setInt(1, id);
			
			int num = sm.executeUpdate();
			DbUtils.release(con, sm,rs);
			
		} catch (Exception e) {
			e.printStackTrace();
			DbUtils.release(con, sm, rs);
			return false;
		}		
		return true;
	}

	/*@Override
	public boolean deleteData(String id) {
		// TODO Auto-generated method stub
		//ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		Connection con = DbUtils.getConnection();
		java.sql.PreparedStatement sm=null;
		String sql =null;
		ResultSet rs =null;
		try {
			sql = "delete from information where id=?";
			sm = con.prepareStatement(sql);
			sm.setString(1, id);
			
			int num = sm.executeUpdate();
			DbUtils.release(con, sm,rs);
		}catch (Exception e) {
			e.printStackTrace();
			//DbUtils.release(con, sm, rs);
			return false;
		}		
		return true;
	}
*/
	@Override
	public ArrayList<Emloyee> selectAllData() {
		ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		Connection con = DbUtils.getConnection();
		Statement sm=null;
		String sql =null;
		ResultSet rs=null;
		try {
			
			sm = con.createStatement();
			sql = "select * from information";
			rs = sm.executeQuery(sql);
			while (rs.next()) {
				Emloyee tempEmloyee = new Emloyee();
				tempEmloyee.setId(rs.getInt(1));
				tempEmloyee.setUsername(rs.getString(2));
				tempEmloyee.setAge(rs.getInt(3));
				tempEmloyee.setSex(rs.getString(4));
				tempEmloyee.setTitle(rs.getString(5));
				tempEmloyee.setSection(rs.getString(6));
				tempEmloyee.setSalary(rs.getInt(7));
				list.add(tempEmloyee);				
			}	
			DbUtils.release(con, sm,rs);
			
		} catch (Exception e) {
			e.printStackTrace();
			DbUtils.release(con, sm, rs);
			return null;
		}		
		return list;
	}

	@Override
	public ArrayList<Emloyee> selectDataById(int id) {
		// TODO Auto-generated method stub
		//Emloyee emloyee = new Emloyee();
		ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		Emloyee tempEmloyee = new Emloyee();
		Connection con = DbUtils.getConnection();
		java.sql.PreparedStatement sm=null;
		String sql =null;
		ResultSet rs=null;
		System.out.println(id);
		try {
			sql = "select * from information where id=?";
			sm = con.prepareStatement(sql);
			sm.setInt(1, id);
			 System.out.println(id);
			 rs = sm.executeQuery();
			 System.out.println(1);
			 while (rs.next()) {
					
					tempEmloyee.setId(rs.getInt(1));
					tempEmloyee.setUsername(rs.getString(2));
					tempEmloyee.setAge(rs.getInt(3));
					tempEmloyee.setSex(rs.getString(4));
					tempEmloyee.setTitle(rs.getString(5));
					tempEmloyee.setSection(rs.getString(6));
					tempEmloyee.setSalary(rs.getInt(7));
					System.out.println(1);
					System.out.print(tempEmloyee.getSection());
					list.add(tempEmloyee);				
				}	
			
			DbUtils.release(con, sm,rs);
		}catch (Exception e) {
			e.printStackTrace();
			DbUtils.release(con, sm, rs);
			return null;
		}		
		return list;
		}

	
	/*@Override
	public Emloyee selectDataById(String id) {
		// TODO Auto-generated method stub
		Emloyee tempEmloyee = new Emloyee();
		Connection con = DbUtils.getConnection();
		java.sql.PreparedStatement sm=null;
		String sql =null;
		ResultSet rs=null;
		try {
			sql = "select from information where id=?";
			sm = con.prepareStatement(sql);
			sm.setString(1, id);
			
			 rs = sm.executeQuery(sql);
			 while (rs.next()) {
					
					tempEmloyee.setId(rs.getInt(1));
					tempEmloyee.setUsername(rs.getString(2));
					tempEmloyee.setAge(rs.getInt(3));
					tempEmloyee.setSex(rs.getString(4));
					tempEmloyee.setTitle(rs.getString(5));
					tempEmloyee.setSection(rs.getString(6));
					tempEmloyee.setSalary(rs.getInt(7));
					//list.add(tempEmloyee);				
				}	
			DbUtils.release(con, sm,rs);
		}catch (Exception e) {
			e.printStackTrace();
			DbUtils.release(con, sm, rs);
			return null;
		}		
		return tempEmloyee;
		}
*/

	@Override
	public boolean updateData(Emloyee tempEmloyee) {
		// TODO Auto-generated method stub
		Connection con = DbUtils.getConnection();
		ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		Statement sm=null;
		String sql =null;
		ResultSet rs=null;
		
     try {
			
			sm = con.createStatement();
			sql = "update information set ";
			
			rs = sm.executeQuery(sql);
			while (rs.next()) {
				
				tempEmloyee.setId(rs.getInt(1));
				tempEmloyee.setUsername(rs.getString(2));
				tempEmloyee.setAge(rs.getInt(3));
				tempEmloyee.setSex(rs.getString(4));
				tempEmloyee.setTitle(rs.getString(5));
				tempEmloyee.setSection(rs.getString(6));
				tempEmloyee.setSalary(rs.getInt(7));
				//list.add(tempEmloyee);				
			}	
			DbUtils.release(con, sm,rs);
			
		} catch (Exception e) {
			e.printStackTrace();
			DbUtils.release(con, sm, rs);
			return false;
		}		
		return true;
	}


}
