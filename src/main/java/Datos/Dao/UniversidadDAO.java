package Datos.Dao;
import Datos.Conexion;
import Modelo.Universidad;

import java.sql.*;


    public  class UniversidadDAO {

        private Connection connection;
        private PreparedStatement ps;
        private ResultSet rs;
        private Universidad universidad;

        public UniversidadDAO(Connection connection) {
            this.connection = connection;
        }


        //Insertar Nueva universidad

        public void insertUniversidad(Universidad universidad) throws SQLException {
            this.ps = this.connection.prepareStatement("Insert into Universidad(id_Universidad,Nombre_Universidad) values (?,?)");
            ps.setInt(1, universidad.getId_Universidad());
            ps.setString(2, universidad.getNombre_Universidad());
            ps.executeUpdate();

        }

        //Obtener  Universidad por ID

        public Universidad getUniversidad(int id_Universidad) throws SQLException {
            this.ps = this.connection.prepareStatement("Select * from Universidad where id_Universidad = ?");
            this.ps.setInt(1, id_Universidad);
            this.rs = this.ps.executeQuery();

            if (!this.rs.next()) {
                Conexion.close(rs);
                Conexion.close(ps);
                return null;
            }
                Universidad uniEncontrada = new Universidad(rs.getInt("id_Universidad"), rs.getString("Nombre_Universidad"));

                Conexion.close(rs);
                Conexion.close(ps);

                return uniEncontrada;



        }

         //Modificar Nombre Universidad
        public Universidad ModNombreUni(int id_Universidad, String Nombre_Universidad) throws SQLException{
            Universidad uniEncontrada = getUniversidad(id_Universidad);

            if(uniEncontrada == null){
                return null;
            }
            this.ps = this.connection.prepareStatement("Update Universidad set Nombre_Universidad= ? where id_Universidad = ? ");
            this.ps.setString(1,Nombre_Universidad);
            this.ps.setInt(2,id_Universidad);
            this.ps.executeUpdate();

            Conexion.close(ps);

            return uniEncontrada;

        }

       //Eliminar una universidad por ID

        public Universidad elimUni(int id_Universidad) throws SQLException{
            Universidad uniEncontrada = getUniversidad(id_Universidad);

            if(uniEncontrada == null){
                return null;
            }

            this.ps =this.connection.prepareStatement("Delete from Universidad where id_Universidad = ?");
            this.ps.setInt(1,id_Universidad);
            this.ps.executeUpdate();

            Conexion.close(ps);

            return uniEncontrada;
        }


    }





