import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main (String[] args)
        {
            Connection connect = null;
                                                                                                                     //  String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('Pelte',1)";                                                                                                                             //   Statement st=null;
                                                                                                                            // String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";                                                                                                              //  String sql="SELECT * FROM student";

            try
                {
                    connect = DriverManager.getConnection (DB_URL , DB_USER , DB_PASSWORD);
                      Statement st=connect.createStatement ();                                                                  // Statement st=connect.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    // System.out.println (st.executeUpdate (insertSql));                                                                                                        // st=connect.createStatement ();      //statement created and put into object

                    //    ResultSet data = st.executeQuery (sql);
                    //PreparedStatement preparedStatement = connect.prepareStatement (prSql);                                                                                                             //     while(data.next ()){
                    //preparedStatement.setInt (2 , 5);
                    //preparedStatement.setString (1 , "Lilly");
                    //preparedStatement.executeUpdate ();
                    //preparedStatement.close ();
                                                                                                                            /* System.out.println ("ID : " +data.getInt ("student_id")
                                                                                                                              +" || "+"Name : " + data.getString ("student_name")
                                                                                                                                  +" || " +"Class : "+ data.getInt ("student_class")); */   //column name is better to use
                    // data.absolute (2);
                    //   System.out.println (data.getString ("student_name"));


                    //  }


                } catch (SQLException e)
                {
                    System.out.println (e.getMessage ());
                }
        }
}
