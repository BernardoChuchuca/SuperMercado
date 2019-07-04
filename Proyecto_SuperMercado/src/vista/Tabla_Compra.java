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
import modelo.Factura;
import modelo.Persona;
import modelo.Registro_Productos;






public class Tabla_Compra extends AbstractTableModel {

	public String[] columnas = {"ID","FECHA","CANTIDAD","ID_PRO","NUM_FAC","ID_PROV"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {Integer.class,Date.class,Integer.class,Integer.class,Integer.class,Integer.class};//tipo de dato a trbajar
	private ArrayList<Registro_Productos> listaEmpleados = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Compra(ArrayList<Registro_Productos> datos) {
		super();
		listaEmpleados= new ArrayList<Registro_Productos>();
		this.listaEmpleados = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Compra() {
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
		Registro_Productos emp = (Registro_Productos) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			emp.setReg_id((int) value);
			break;
		case 1:
			emp.setFecha_compra((Date) value);
			break;
		
		case 2:
			emp.setReg_cantidad((int) value);
			break;
		case 3:
			emp.setPro_id((int) value);
			break;
                case 4:
			emp.setReg_num_fac((int) value);
			break;
                case 5:
			emp.setProv_id((int) value);
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
		Registro_Productos emp = (Registro_Productos) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			return emp.getReg_id();
		case 1:
			return emp.getFecha_compra();
                case 2:
			return emp.getReg_cantidad();
		case 3:
			return emp.getPro_id();
                 case 4:
			return emp.getReg_num_fac();
                case 5:
			return emp.getProv_id();
		
                      
		}
		return new String();
	}

}
