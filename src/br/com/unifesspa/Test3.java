package br.com.unifesspa;

public class Test3 {
	public static void main(String[] args) throws Exception{
		int portServidor = 9992;

		new Thread(new ClienteUdp(portServidor)).start();
		new Thread(new ServidorUdp(portServidor)).start();
		}
}
