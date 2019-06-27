/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import modelo.Producto;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bryan
 */
public class Tabla_Productos extends AbstractTableModel {
    public String[] columnas = {"Id","Codigo","Nombre","Fecha Ela","Fecha Cad","Compañia","Precio","Stock","Iva","Descuento","Categoria","Proveedor"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {Integer.class, String.class,String.class,Date.class,Date.class,String.class,Integer.class,Integer.class,String.class,String.class,Integer.class, Integer.class};//tipo de dato a trbajar
	private ArrayList<Producto> listaProducto = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Productos(ArrayList<Producto> datos) {
		super();
		listaProducto= new ArrayList<Producto>();
		this.listaProducto = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Productos() {
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
		return listaProducto.size();
	}

	/**
	 * establece los tados que se optiene de persona
	 */
	public void setValueAt(Object value, int row, int col) {
		Producto pro = (Producto) (listaProducto.get(row));

		switch (col) {
		
		case 0:
			pro.setPro_id((int) value);
			break;
		case 1:
			pro.setPro_codigo((String) value);
			break;
		
		case 2:
			pro.setPro_nombre((String) value);
			break;
		case 3:
			pro.setPro_fec_elab((Date) value);
			break;
                case 4:
			pro.setPro_fec_cadu((Date) value);
			break;
		case 5:
			pro.setPro_marca((String) value);
			break; 
                case 6:
			pro.setPro_precio((int) value);
			break;
                case 7:
			pro.setPro_stock((int) value);
			break;
		case 8:
			pro.setPro_iva((String) value);
			break;            
                case 9: 
                        pro.setPro_descuento((int)value);
                        break;
                case 10:
                        pro.setCat_id((int)value);
                        break;
                case 11:
                        pro.setProv_id((int)value);
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
		Producto pro = (Producto) (listaProducto.get(row));

		switch (col) {
		
		case 0:
			return pro.getPro_id();
		case 1:
			return pro.getPro_codigo();
                case 2:
			return pro.getPro_nombre();
		case 3:
			return pro.getPro_fec_elab();
                case 4:
			return pro.getPro_fec_cadu();
		case 5:
			return pro.getPro_marca();
                case 6:
			return pro.getPro_precio();
		case 7:
			return pro.getPro_stock();
                case 8:
			return pro.getPro_iva();
                case 9:
                    return pro.getPro_descuento();
                case 10:
                    return pro.getCat_id();
                case 11:
                    return pro.getProv_id();
                        
		}
		return new String();
	}
}
