import java.sql.*;
import java.util.*;
//import com.sun.java_cup.internal.runtime.Scanner;
public class insertdata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("User Id");
			int id=sc.nextInt();
			System.out.println("Name");
			String name=sc.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			int res=ps.executeUpdate();
			if(res==0)
				System.out.println(" not inserted");
			else
				System.out.println("inserted");
			ps.close();
			con.close();
			sc.close();
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
