/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Farid Estepa
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de una Pieza del tipo Alfil.
 */
public class Alfil extends Pieza {
	
	private static final long serialVersionUID = 1L;
	
	private static List<Movimiento> movimientos;

	static {
		movimientos = new ArrayList<>(4);
		Movimiento arribaDerecha = new Movimiento(1, 1, true, true, false, -1);
		Movimiento abajoDerecha = new Movimiento(1, -1, true, true, false, -1);
		Movimiento arribaIzquierda = new Movimiento(-1, 1, true, true, false, -1);
		Movimiento abajoIzquierda = new Movimiento(-1, -1, true, true, false, -1);
		movimientos.add(arribaDerecha);
		movimientos.add(abajoDerecha);
		movimientos.add(arribaIzquierda);
		movimientos.add(abajoIzquierda);
	}
	
	/**
	 * Crea una pieza del tipo Alfil.
	 * @param color Recibe el color de la pieza.
	 */
	public Alfil(ColorPieza color){
		super(color);
	}

	@Override
	public List<Movimiento> dameMovimientos() {
		List<Movimiento> movimientosCopia = new ArrayList<>();
		for (Movimiento unMovimiento: movimientos) {
			movimientosCopia.add(new Movimiento(unMovimiento));
		}
		return movimientosCopia;
	}

	@Override
	public NombrePieza dameNombre() {
		return NombrePieza.ALFIL;
	}

	@Override
	public boolean puedoCoronar(int fila) {
		return false;
	}

	@Override
	public boolean puedoEnrocar() {
		return false;
	}
}