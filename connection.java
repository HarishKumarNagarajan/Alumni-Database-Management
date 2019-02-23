import java.sql.*;
import java.lang.*;
import java.sql.SQLException;
public class connection {
	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
		Statement st=con.createStatement();
		String sql="select * from student";
		ResultSet rs=st.executeQuery(sql);
		int i=0;
		String j;
		if(rs!= null )
		{
		while(rs.next())
		{
			i=rs.getInt("userid");
			j=rs.getString("name");
			System.out.println(i+"  "+j);
		}
		}
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
