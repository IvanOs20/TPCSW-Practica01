package org.uv.tpcsw.practica01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class ConexionBD {

    private static ConexionBD cx = null;

    public static ConexionBD getInstance() {
        if (cx == null) 
            cx = new ConexionBD();
        return cx;
    }

    private Connection con = null;

    public ConexionBD() {

        try {
            String url = "jdbc:postgresql://localhost:5432/ejemplo";
            con = DriverManager.getConnection(url, "postgres", "postgres");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean execute(String sql) {

        try {
            Statement stm = con.createStatement();
            return stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
