package vista;


/**
 * @(#) ModelPersona.java 11 may. 2018
 * Universidad Politecnica Salesiana
 * Cuenca-Ecuador
 */


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Empleado;
import modelo.Persona;



public class Tabla_Clientes extends AbstractTableModel {

	public String[] columnas = {"id","Cedula","Nombre","Apellido","Correo","Direccion","Telefono"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {Integer.class, String.class,String.class,String.class,String.class,String.class,String.class};//tipo de dato a trbajar
	private ArrayList<Persona> listaEmpleados = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Clientes(ArrayList<Persona> datos) {
		super();
		listaEmpleados= new ArrayList<Persona>();
		this.listaEmpleados = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Clientes() {
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
			emp.setPer_direccion((String) value);
			break;
		case 6:
			emp.setPer_telefono((String) value);
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
			return emp.getPer_direccion();
                case 6:
			return emp.getPer_telefono();
               
                        
                
                                
                        
                
                        
                        
		
		
		}
		return new String();
	}

}
