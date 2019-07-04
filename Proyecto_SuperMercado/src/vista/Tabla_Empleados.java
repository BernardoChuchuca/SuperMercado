package vista;


/**
 * @(#) ModelPersona.java 11 may. 2018
 * Universidad Politecnica Salesiana
 * Cuenca-Ecuador
 */


import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Empleado;
import modelo.Persona;



public class Tabla_Empleados extends AbstractTableModel {

	public String[] columnas = {"id","Cedula","Nombre","Apellido","Correo","Cargo","Usuario","Contraseña","Direccion","Telefono","Fecha_Nacimiento"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {Integer.class, String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,Integer.class};//tipo de dato a trbajar
	private ArrayList<Persona> listaEmpleados = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Empleados(ArrayList<Persona> datos) {
		super();
		listaEmpleados= new ArrayList<Persona>();
		this.listaEmpleados = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Empleados() {
	}


	/**
	 * devuelve el numero de columnas que posee la tabla
	 * @return 
	 */
	public int getColumnCount() {
		return columnas.length;
	}

	/**
	 * devuelve la cantidad de filas que posee la tabla
	 */
	public int getRowCount() {
		return listaEmpleados.size();
	}

	/**
	 * establece los tados que se optiene de persona
	 */
	public void setValueAt(Object value, int row, int col) {
		Persona emp = (Persona) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			emp.setPer_id((int) value);
			break;
		case 1:
			emp.setPer_cedula((String) value);
			break;
		
		case 2:
			emp.setPer_nombre((String) value);
			break;
		case 3:
			emp.setPer_apellido((String) value);
			break;
                case 4:
			emp.setCorreo((String) value);
			break;
                case 5:
			emp.setEmp_cargo((String) value);
			break;        
		case 6:
			emp.setEmp_usuario((String) value);
			break; 
                case 7:
			emp.setEmp_contrasena((String) value);
			break;
                case 8:
			emp.setPer_direccion((String) value);
			break;
		case 9:
			emp.setPer_telefono((String) value);
			break;   
                case 10: 
                        emp.setFec_naci((Date)value); 
                        
                        break;
                
		}
	}

	/**
	 * devuelve el nombre de la columna
	 */
	public String getColumnName(int col) {
		return columnas[col];
	}

	/**
	 * devuelve el tipo de colunma
	 */
	public Class getColumnClass(int col) {
		return columnasTipos[col];
	}
	/**
	 * obtiene la informacion de persona 
	 */
	public Object getValueAt(int row, int col) {
		Persona emp = (Persona) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			return emp.getPer_id();
		case 1:
			return emp.getPer_cedula();
                case 2:
			return emp.getPer_nombre();
		case 3:
			return emp.getPer_apellido();
                 case 4:
			return emp.getCorreo();        
                case 5:
			return emp.getEmp_cargo();
		case 6:
			return emp.getEmp_usuario();
                case 7:
			return emp.getEmp_contrasena();
		case 8:
			return emp.getPer_direccion();
                case 9:
			return emp.getPer_telefono();
               
                        
                 case 10:
                    return emp.getFec_naci();
                                
                        
                
                        
                        
		
		
		}
		return new String();
	}

}
