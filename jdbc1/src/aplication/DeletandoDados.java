package aplication;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletandoDados {

    public static void main(String [] args){
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE Id = ?");

            st.setInt(1, 5);

            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows Affected: " + rowsAffected);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }
    }
}
