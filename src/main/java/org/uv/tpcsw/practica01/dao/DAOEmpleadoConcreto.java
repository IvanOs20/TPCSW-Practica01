package org.uv.tpcsw.practica01.dao;

import java.util.List;

public class DAOEmpleadoConcreto implements IDAOGeneral<EmpleadoPojo, String> {

    @Override
    public boolean save(EmpleadoPojo pojo) {
        ConexionBD con = ConexionBD.getInstance();
        String sql = "instert into empleados (clave, nombre, direccion, telefono) valies "
                + " ('"+pojo.getClave() + "','"+ pojo.getNombre() + " , " + pojo.getDireccion() + ""
                + " , " + pojo.getTelefono() + ")";
        return con.execute(sql);
                
    }

    @Override
    public boolean delete(String pojo) {
        ConexionBD con = ConexionBD.getInstance();
        String sql = "delete from empleados where clave = '" + pojo + "'";
        return con.execute(sql);}

    @Override
    public boolean update(EmpleadoPojo pojo, String id) {
        ConexionBD con = ConexionBD.getInstance();
        String sql = "update empleados set nombre = '"+pojo.getNombre() +"', "
                + "direccion = '" + pojo.getDireccion() + "', telefono = '" + pojo.getTelefono() +"' "
                + "where clave = '" + id + "'";
        return con.execute(sql);
    }

    @Override
    public List<EmpleadoPojo> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoPojo findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
