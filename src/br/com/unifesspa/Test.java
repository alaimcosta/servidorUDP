/*
Trabalho pr�tico sobre sockets UDP,
para disciplina de Sistemas Distribuidos.
Equipe:
Alaim de Jesus Le�o Costa
Manoel Malon Costa de Moura
*/
package br.com.unifesspa;

public class Test {
	public static void main(String[] args) throws Exception {
		int portServidor = 9999;
		
		new Thread(new ClienteUdp(portServidor)).start();
		new Thread(new ServidorUdp(portServidor)).start();
	}
}
