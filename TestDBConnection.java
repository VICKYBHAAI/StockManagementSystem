import java.sql.Connection;
//import java.sql.*;
import java.sql.DriverManager;

public class TestDBConnection {
public static void main(String[] args) {
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/inventory";
String user="root";
String pwd="Kvvr@1729";
Connection c=DriverManager.getConnection(url,user,pwd);
if(c.isClosed())
{
System.out.println("databse is closed ");
}
else
System.out.println("databse is opened ");
}
catch(Exception e)
{
e.printStackTrace();
}
}

}
