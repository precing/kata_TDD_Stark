package cl.ubb.agil.test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import cl.ubb.agil.java.Stark;


public class TestStark {

	@Test
	public void canCreateStark(){
		Stark pila= new Stark();
	}
	
	@Test 
	public void newStarkBasio(){
		Stark pila=new Stark();
		assertEquals(true, pila.estaBasio());
	}
	
	@Test
	public void agregarUnoResultadoNoBasio(){
		Stark pila=new Stark();
		pila.pop(1);
		assertEquals(false, pila.estaBasio());
	}
}
