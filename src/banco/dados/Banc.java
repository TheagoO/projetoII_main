package banco.dados;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Banc {
	
	public void Read(String[] args) {
		
		Path arquivo = Paths.get("C:/Users/call2/Desktop/Facul 2° Periodo/Programação OO atv. ex/Programa/src/banco/dados/Dados.txt");
		
		try {
			byte[] texto = Files.readAllBytes(arquivo);
			String leitura = new String(texto);
			
			System.out.println(leitura);
			
		}catch(Exception erro) {
			
		}
		
	}
	
}
