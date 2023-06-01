package atividadeParticip02;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaTest {

	@Test
	public void testeIniciaListaVerificaseestaVazia() {
		Lista lista1 = new Lista();
		boolean isVazia = lista1.listaVazia();
		assertEquals(isVazia, true);
	}
	
	@Test
	public void testeIniciaListaCriaNodeVerificaListaVazia() {
		Lista lista1 = new Lista();
		lista1.inserirInicio("Maria");
		boolean isVazia = lista1.listaVazia();
		assertEquals(isVazia, false);
	}
	
	@Test
	public void testeInserirInicio() {
		Lista lista1 = new Lista();
		lista1.inserirInicio("Maria");
		lista1.inserirInicio("Marcelo");
		lista1.inserirInicio("Victor");
		
		boolean isVazia = lista1.listaVazia();
		assertEquals(isVazia, false);
		
		assertEquals(3, lista1.getQuantidade());
	}
	
	@Test
	public void testeInserirFinal() {
		Lista lista1 = new Lista();
		lista1.inserirFinal("Maria");
		lista1.inserirFinal("Marcelo");
		lista1.inserirFinal("Victor");
		
		boolean isVazia = lista1.listaVazia();
		assertEquals(isVazia, false);
		
		assertEquals(3, lista1.getQuantidade());
	}
	
	@Test
	public void testMostrarLista() {
		Lista lista1 = new Lista();
		assertEquals("Lista Vazia", lista1.mostrarLista());
		
		lista1.inserirFinal("Maria");
		lista1.inserirFinal("Victor");
		lista1.inserirFinal("Marcelo");
		lista1.inserirInicio("Ana");
		
		assertEquals("Ana -> Maria -> Victor -> Marcelo -> ", lista1.mostrarLista());
		
		}
	
	@Test
	public void testMostrarListaInvertida() {
		Lista lista1 = new Lista();
		assertEquals("Lista Vazia", lista1.mostrarListaInvertida());
		
		lista1.inserirFinal("Maria");
		lista1.inserirFinal("Victor");
		lista1.inserirFinal("Marcelo");
		lista1.inserirInicio("Ana");
		
		assertEquals("Marcelo -> Victor -> Maria -> Ana -> ", lista1.mostrarListaInvertida());
		
		}
	
	@Test
	public void testProcuraNome() {
		Lista lista1 = new Lista();
		assertEquals("Lista Vazia", lista1.mostrarLista());
		assertEquals(null, lista1.procuraNome("Igor"));
		
		lista1.inserirFinal("Maria");
		lista1.inserirFinal("Victor");
		lista1.inserirFinal("Marcelo");
		lista1.inserirInicio("Ana");
		
		assertEquals("Ana -> Maria -> Victor -> Marcelo -> ", lista1.mostrarLista());
		lista1.procuraNome("Maria");
		lista1.procuraNome("Marcelo");
		lista1.procuraNome("Igor");

		}
	
	@Test
	public void testNomesRepetidos() {
		Lista lista1 = new Lista();
		assertEquals("Lista Vazia", lista1.mostrarLista());
		assertEquals(null, lista1.procuraNome("Igor"));
		
		lista1.inserirFinal("Maria");
		lista1.inserirFinal("Maria");
		lista1.inserirFinal("Marcelo");
		lista1.inserirInicio("Maria");
		
		
		}
	
	@Test
	public void testExcluiNomes() {
		Lista lista1 = new Lista();
		assertEquals("Lista Vazia", lista1.mostrarLista());
		assertEquals(null, lista1.procuraNome("Igor"));
		
		lista1.excluiNome("Maria");
		
		lista1.inserirFinal("Maria");
		assertEquals("Maria -> ", lista1.mostrarLista());
		lista1.excluiNome("Maria");
		assertEquals("Lista Vazia", lista1.mostrarLista());
		assertEquals(null, lista1.procuraNome("Igor"));
		assertEquals(null, lista1.procuraNome("Maria"));
		
		lista1.inserirFinal("Maria");
		lista1.inserirFinal("Victor");
		lista1.inserirFinal("Marcelo");
		lista1.inserirInicio("Ana");
		
		assertEquals("Ana -> Maria -> Victor -> Marcelo -> ", lista1.mostrarLista());
		lista1.procuraNome("Maria");
		lista1.procuraNome("Marcelo");
		lista1.procuraNome("Igor");
		
		lista1.excluiNome("Maria");
		assertEquals("Ana -> Victor -> Marcelo -> ", lista1.mostrarLista());
		lista1.excluiNome("Igor");
		lista1.procuraNome("Maria");
		lista1.procuraNome("Marcelo");

		}
	
	
	
	

}
