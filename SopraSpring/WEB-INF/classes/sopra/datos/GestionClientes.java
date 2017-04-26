
import java.sql.*;


public class GestionClientes {
Datos dt;
public GestionClientes(String driver, String cadenacon) {
dt=new Datos(driver,cadenacon);
}
/*
public boolean validar(ValidacionForm vf){
boolean estado=false;
try{
Connection cn=dt.getConexion();
//instrucción SQL para obtener los datos
//del usuario indicado
String query = "select * from clientes ";
query+="where password ='"+vf.getPassword();
query+="' and usuario='"+vf.getUsuario()+"'";
Statement st =cn.createStatement();
ResultSet rs = st.executeQuery(query);
estado= rs.next();
dt.cierraConexion(cn);
}
catch(Exception e){
e.printStackTrace();
}
finally{
return estado;
}
}
public void registrar(RegistroForm rf){
//genera la instrucción SQL de inserción a partir
//de los datos almacenados en el JavaBean Usuario
String query = "INSERT INTO clientes ";
query+=values("'"+rf.getNombre()+ "','"+
rf.getApellidos()+"','"+rf.getUsuario()+
"','"+rf.getPassword()+
"','"+rf.getEmail()+"')");
try{
Connection cn=dt.getConexion();
Statement st =cn.createStatement();
st.execute(query);
st.close();
dt.cierraConexion(cn);
}

catch(Exception e){e.printStackTrace();}
}
*/
}