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



public class Tabla_Detalle_Factura extends AbstractTableModel {

	public String[] columnas = {"ID","CODIGO","FECHA","IVA","SUBTOTAL","TOTAL PAGAR","ESTADO","ID_EMPLEADO","ID_CLIENTE"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {Integer.class,Integer.class,Date.class,Double.class,Double.class,Double.class,String.class,Integer.class,Integer.class};//tipo de dato a trbajar
	private ArrayList<Factura> listaEmpleados = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Detalle_Factura(ArrayList<Factura> datos) {
		super();
		listaEmpleados= new ArrayList<Factura>();
		this.listaEmpleados = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Detalle_Factura() {
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
		Factura emp = (Factura) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			emp.setFact_id((int) value);
			break;
		case 1:
			emp.setFact_codigo((int) value);
			break;
		
		case 2:
			emp.setFact_fecha((Date) value);
			break;
		case 3:
			emp.setFact_iva((Double) value);
			break;
                case 4:
			emp.setFact_subtotal((Double) value);
			break;
                case 5:
			emp.setFact_total_pagar((Double) value);
			break;        
		case 6:
			emp.setFact_estado((String) value);
			break; 
                case 7:
			emp.setMer_per_id((int) value);
			break;
                case 8:
			emp.setMer_per_id1((int) value);
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
		Factura emp = (Factura) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			return emp.getFact_id();
		case 1:
			return emp.getFact_codigo();
                case 2:
			return emp.getFact_fecha();
		case 3:
			return emp.getFact_iva();
                 case 4:
			return emp.getFact_subtotal();        
                case 5:
			return emp.getFact_total_pagar();
		case 6:
			return emp.getFact_estado();
                case 7:
			return emp.getMer_per_id();
		case 8:
			return emp.getMer_per_id1();
                   
                      
		}
		return new String();
	}

}
