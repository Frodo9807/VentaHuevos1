package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="venta")
@Table(name="venta")
public class Venta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name="ID_PRODUCTO",nullable=false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private int id_producto;
	@Column(name="CANTIDAD",nullable=false)
	private int cantidad;
	@JoinColumn(name="ID_USUARIO")
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private int id_usuario;
	@Column(name="TOTAL", nullable=false)
	private double total;
	
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
    
	
}
