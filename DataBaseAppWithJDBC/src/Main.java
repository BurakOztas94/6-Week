import javax.xml.transform.Result;
import java.sql.*;


public class Main {

    public static final String DB_URL = "jdbc:mysql://localhost/workplace";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main (String[] args)
        {
            Connection connect = null;
            Statement statement = null;

            try
                {
                    connect = DriverManager.getConnection (DB_URL , DB_USERNAME , DB_PASSWORD);
                    statement = connect.createStatement ();

                    ResultSet resultSet = statement.executeQuery ("SELECT * FROM employees");
                    while (resultSet.next ())
                        {
                            System.out.println (
                                    "\tEmployee ID :\t" + resultSet.getInt ("employee_id") +
                                            "\t||\tEmployee Name :\t" + resultSet.getString ("employee_name") +
                                            "\t\t|| Employee Position :\t " + resultSet.getString ("employee_position") + "\t" +
                                            "\t||\tEmployee Salary :\t " + resultSet.getDouble ("employee_salary") + "\t"
                            );
                        }


                } catch (SQLException e)
                {
                    System.out.println (e.getMessage ());
                }


        }
}
