package vista;


/**
 * @(#) ModelPersona.java 11 may. 2018
 * Universidad Politecnica Salesiana
 * Cuenca-Ecuador
 */


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Empleado;
import modelo.FacDetalle;
import modelo.Persona;



public class Tabla_Factura extends AbstractTableModel {

	public String[] columnas = {"CANTIDAD","DETALLE","V.UNITARIO","IVA","DESCUENTO","TOTAL"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {Double.class, String.class,Double.class,Double.class,Double.class,Double.class};//tipo de dato a trbajar
	private ArrayList<FacDetalle> listaEmpleados = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Factura(ArrayList<FacDetalle> datos) {
		super();
		listaEmpleados= new ArrayList<FacDetalle>();
		this.listaEmpleados = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Factura() {
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
		FacDetalle emp = (FacDetalle) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			emp.setCantidad((Double) value);
			break;
		case 1:
			emp.setDetalle((String) value);
			break;
		
		case 2:
			emp.setPrecio((Double) value);
			break;
		case 3:
			emp.setIva((Double) value);
			break;
                case 4:
			emp.setDescuento((Double) value);
			break;
               
                case 5:
			emp.setSubtotal((Double) value);
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
		FacDetalle emp = (FacDetalle) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			return emp.getCantidad();
		case 1:
			return emp.getDetalle();
                case 2:
			return emp.getPrecio();
		case 3:
			return emp.getIva();
                 case 4:
			return emp.getDescuento();        
               
		case 5:
			return emp.getSubtotal();
            
		}
		return new String();
	}

}
