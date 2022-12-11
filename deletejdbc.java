package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class deletejdbc {
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","");
			Statement stmt=con.createStatement();
			Scanner dis=new Scanner(System.in);
			System.out.println("Enter Roll Number of student to be deleted:");
          int s1=dis.nextInt();
         stmt.executeUpdate("delete from student where roll=("+s1+")");
          System.out.println("One Record Deleted!!!");
          
	}catch(ClassNotFoundException e){}
   catch(SQLException e1){System.out.println(e1);}
      

}
}

