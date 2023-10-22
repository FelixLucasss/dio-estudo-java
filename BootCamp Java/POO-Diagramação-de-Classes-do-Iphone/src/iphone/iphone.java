package iphone;

import iphone.apps.Camera;
import iphone.apps.Ipod;
import iphone.apps.Telefone;

public class iphone implements Camera, Telefone, Ipod {
	
	public void bloquear() {
		System.out.println("Celular bloqueado!");
	}
	public void desbloquear() {
		System.out.println("Celular desbloqueado!");
	}
	
	
	@Override
	public void ligar() {
		System.out.println("Ligando para o número...");
	}
	@Override
	public void atender() {
		System.out.println("Atendendo ligação...");
	}
	@Override
	public void recusar() {
		System.out.println("Chamada recusada.");
	}
	@Override
	public void correioVoz() {
		System.out.println("Sem mensagens no correio de voz.");
	}
	@Override
	public void foto() {
		System.out.println("Tirando foto!");
		System.out.println("Salvando foto!");
	}
	@Override
	public void iniciarVideo() {
		System.out.println("Iniciando gravação.");
	}
	@Override
	public void finalizarVideo() {
		System.out.println("Finalizando gravação.");
		System.out.println("Gravação salva!");
	}
	@Override
	public void lanternaOn() {
		System.out.println("Lanterna ligada.");
	}
	@Override
	public void lanternaOff() {
		System.out.println("Lanterna desligada");
	}
	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica...");
	}
	@Override
	public void play() {
		System.out.println("Reproduzindo musica...");
	}
	@Override
	public void pause() {
		System.out.println("Musica pausada.");
	}
	@Override
	public void musicaAnterior() {
		System.out.println("Reproduzindo musica anterior...");
	}
	@Override
	public void proximaMusica() {
		System.out.println("Reproduzindo próxima musica...");
	}
}
