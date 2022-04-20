package br.com.unifesspa;

public class Test3 {
	public static void main(String[] args) throws Exception{
		new Thread(new ClienteUdp(7770)).start();
		new Thread(new ServidorUdp(9992)).start();
		}
}
