package Tests;
import logica.*;
import static org.junit.Assert.*;

import org.junit.Test;
public class PiezasTest {

	@Test
	public void testPieza() {
		/* instanciamos un alfil ya que la clase Pieza es abstracta
		 */
		Pieza pieza = new Alfil(ColorPieza.BLANCO);
		assertTrue(pieza.dameColor()==ColorPieza.BLANCO);
		assertTrue(pieza.dameColor()!=ColorPieza.NEGRO);
		pieza.ponerSeMovio();
		pieza.ponerSeMovio();
		assertEquals(pieza.dameSeMovio(),true);
		pieza.sacarSeMovio();
		pieza.sacarSeMovio();
		assertEquals(pieza.dameSeMovio(),false);
		pieza.sacarSeMovio();
		assertEquals(pieza.dameSeMovio(),false);
	}
	//PEON,TORRE,CABALLO,ALFIL,DAMA,REY;
	@Test
	public void testPeon() throws CloneNotSupportedException{
		Pieza peon = new Peon(ColorPieza.BLANCO);
		assertEquals(peon.dameNombre(),NombrePieza.PEON);
		assertEquals(peon.dameMovimientos().size(),3);
		assertEquals(peon.puedoEnrocar(),false);
		assertEquals(peon.puedoCoronar(0),false);
		assertEquals(peon.puedoCoronar(8),true);
		peon.sacarSeMovio();
		assertEquals(peon.dameSeMovio(),false);
		peon.ponerSeMovio();		
		peon.ponerSeMovio();
		peon.sacarSeMovio();
		System.out.println(peon.dameMovimientos().size());
		assertEquals(peon.dameMovimientos().size(),3);
		assertEquals(peon.dameMovimientos().get(0).cantidadDeVeces(),1);
		peon.sacarSeMovio();
		assertEquals(peon.dameMovimientos().get(2).cantidadDeVeces(),2);
		peon.dameMovimientos().clear();
		assertEquals(peon.dameMovimientos().size(),3);
	}
	
	@Test
	public void testTorre(){
		Pieza torre = new Torre(ColorPieza.NEGRO);
		assertEquals(torre.dameNombre(),NombrePieza.TORRE);
		torre.sacarSeMovio();
		assertEquals(torre.puedoEnrocar(),true);
	}
	
	@Test
	public void testAfil() throws CloneNotSupportedException{
		Pieza pieza = new Alfil(ColorPieza.BLANCO);
		assertEquals(pieza.dameNombre(),NombrePieza.ALFIL);
		assertEquals(pieza.dameMovimientos().size(),4);
		assertEquals(pieza.puedoEnrocar(),false);
		assertEquals(pieza.puedoCoronar(0),false);
		pieza.dameMovimientos().clear();
		assertEquals(pieza.dameMovimientos().size(),4);
	}


}