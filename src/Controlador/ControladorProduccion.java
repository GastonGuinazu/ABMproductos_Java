package Controlador;

import Modelo.Componente;
import Modelo.Produccion;
import Modelo.Responsable;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class ControladorProduccion {

    private String conexion;

    public ControladorProduccion() {
        this.conexion = "jdbc:mysql://localhost:3306/producciones?user=root&password=gasti123";
    }

    public List<Responsable> obtenerResponsables() {

        List<Responsable> lst = new ArrayList<>();
        String query = "SELECT * FROM responsable";
        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                int id = rs.getInt("idResponsable");
                String nombre = rs.getString("nomResponsable");

                lst.add(new Responsable(id, nombre));
            }

            rs.close();
            st.close();
            cnn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public List<Componente> obtenerComponentes() {
        List<Componente> lst = new ArrayList<>();
        String query = "Select * from componente";

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("idComponente");
                String nombre = rs.getString("descripcion");

                lst.add(new Componente(id, nombre));
            }

            rs.close();
            st.close();
            cnn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public List<Produccion>obtenerProducciones(){
        List<Produccion> lst = new ArrayList<>();
        String query = "SELECT p.*,r.nomResponsable, c.descripcion " +
"FROM produccion p JOIN responsable r ON (p.idResponsable = r.idResponsable) " +
"JOIN componente c ON (p.idComponente = c.idComponente)";
        
        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            
            while (rs.next()){
                
                int idComponente = rs.getInt("idComponente");
                String descripcion = rs.getString("descripcion");
                Componente c = new Componente (idComponente,descripcion);
                
                int idResponsable = rs.getInt("idResponsable");
                String nomResponsable = rs.getString("nomResponsable");
                Responsable r = new Responsable (idResponsable,nomResponsable);
                
                int idProduccion = rs.getInt("idProducicon");
                String fecha = rs.getString("fecha");
                int cantidad = rs.getInt("cantidadProduccion");
                
                lst.add(new Produccion (idProduccion,c,r,fecha,cantidad));                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lst;
    }
    
    public boolean insertarProduccion(Produccion prod){
        boolean ok = true;
        String query = "INSERT INTO produccion (idResponsable,fecha,idComponente,cantidadProduccion) VALUES (?,?,?,?)";
        try (Connection cnn = DriverManager.getConnection(conexion);
                PreparedStatement ps= cnn.prepareStatement(query)) {
            
            ps.setInt(1,prod.getResponsable().getIdResponsable());
            ps.setString(2, prod.getFecha());
            ps.setInt(3, prod.getComponente().getIdComponente());
            ps.setInt(4,prod.getCantidadProduccion());
            
            ok= ps.execute();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
            ok = false;
        }
        return ok;
    }
    
    public List<Produccion>obtenerProduccionesXComp(String nom){
        List<Produccion> lst = new ArrayList<>();
        String query = "SELECT p.*,r.nomResponsable, c.descripcion FROM produccion p " +
"JOIN responsable r ON (p.idResponsable = r.idResponsable) " +
"JOIN componente c ON (p.idComponente = c.idComponente)" +
"WHERE c.descripcion LIKE '"+ nom + "'";
        
        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            
            while (rs.next()){
                
                int idComponente = rs.getInt("idComponente");
                String descripcion = rs.getString("descripcion");
                Componente c = new Componente (idComponente,descripcion);
                
                int idResponsable = rs.getInt("idResponsable");
                String nomResponsable = rs.getString("nomResponsable");
                Responsable r = new Responsable (idResponsable,nomResponsable);
                
                int idProduccion = rs.getInt("idProducicon");
                String fecha = rs.getString("fecha");
                int cantidad = rs.getInt("cantidadProduccion");
                
                lst.add(new Produccion (idProduccion,c,r,fecha,cantidad));                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lst;
    }
    
    public List<Produccion>obtenerProduccionesXResp(String nom){
        List<Produccion> lst = new ArrayList<>();
        String query = "SELECT p.*,r.nomResponsable, c.descripcion FROM produccion p " +
"JOIN responsable r ON (p.idResponsable = r.idResponsable) " +
"JOIN componente c ON (p.idComponente = c.idComponente)" +
"WHERE r.nomResponsable LIKE '"+ nom + "'";
        
        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            
            while (rs.next()){
                
                int idComponente = rs.getInt("idComponente");
                String descripcion = rs.getString("descripcion");
                Componente c = new Componente (idComponente,descripcion);
                
                int idResponsable = rs.getInt("idResponsable");
                String nomResponsable = rs.getString("nomResponsable");
                Responsable r = new Responsable (idResponsable,nomResponsable);
                
                int idProduccion = rs.getInt("idProducicon");
                String fecha = rs.getString("fecha");
                int cantidad = rs.getInt("cantidadProduccion");
                
                lst.add(new Produccion (idProduccion,c,r,fecha,cantidad));                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lst;
    }
    
    public List<Produccion>obtenerProduccionesX2Filtros(String nom1,String nom2){
        List<Produccion> lst = new ArrayList<>();
        String query = "SELECT p.*,r.nomResponsable, c.descripcion FROM produccion p " +
"JOIN responsable r ON (p.idResponsable = r.idResponsable) " +
"JOIN componente c ON (p.idComponente = c.idComponente)" +
"WHERE r.nomResponsable LIKE '"+ nom1 + "'" +
 "AND c.descripcion LIKE '"+nom2+"'";
        
        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            
            while (rs.next()){
                
                int idComponente = rs.getInt("idComponente");
                String descripcion = rs.getString("descripcion");
                Componente c = new Componente (idComponente,descripcion);
                
                int idResponsable = rs.getInt("idResponsable");
                String nomResponsable = rs.getString("nomResponsable");
                Responsable r = new Responsable (idResponsable,nomResponsable);
                
                int idProduccion = rs.getInt("idProducicon");
                String fecha = rs.getString("fecha");
                int cantidad = rs.getInt("cantidadProduccion");
                
                lst.add(new Produccion (idProduccion,c,r,fecha,cantidad));                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lst;
    }

}
