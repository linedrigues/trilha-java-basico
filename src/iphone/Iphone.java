package iphone;

import iphone.aparelhoTelefonico.AparelhoTelefonio;
import iphone.navegador.Navegador;
import iphone.navegador.Safari;
import iphone.reprodutorMusical.Ipod;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone{
	public static void main(String[] args) {
		
	Navegador navegador = new Safari();
	
	navegador.adicionarNovaAba();
	navegador.atualizarPagina();
	
	ReprodutorMusical musical = new Ipod();
	musical.selecionarMusica();
	musical.tocar();
	musical.pausar();
	
	AparelhoTelefonio telefonio = new AparelhoTelefonio();
	telefonio.atender();
	telefonio.ligar();
	telefonio.iniciarCorreioVoz();
	}
}
