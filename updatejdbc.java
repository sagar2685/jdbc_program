package jdbc_demo;

import java.sql.*;
import java.util.*;
public class updatejdbc {
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","");
			Statement stmt=con.createStatement();
			Scanner dis=new Scanner(System.in);
			System.out.println("Enter Roll Number to update name of student :");
          int s1=dis.nextInt();
          System.out.println("Enter Student Name to be updated:");
          String s2=dis.next();
         stmt.executeUpdate("update student set name=('"+s2+"') where roll=("+s1+")");
          System.out.println("Name updated successfully!!");
          
	}catch(ClassNotFoundException e){}
   catch(SQLException e1){System.out.println(e1);}
      

}
}

