package banco.dados;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Banco {
		
	public static String Read(){		
		String conteudo = "";			
		try {			
			FileReader arq = new FileReader("C:/Users/call2/Desktop/Facul 2� Periodo/Programa��o OO atv. ex/Programa/src/banco/dados/Dados.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			try {
				linha = lerArq.readLine();
				while(linha!=null) {
					conteudo += linha+"\r\n";
					linha = lerArq.readLine();
				}
				arq.close();
			}catch(IOException ex) {
				conteudo = "Erro: N�o foi poss�vel Ler o arquivo";
			}
			
		}catch(IOException ex) {
			conteudo = "Erro: Arquivo n�o encontrado";
		}
		
		if(conteudo.contains("Erro")) {
			return "";
		}else {
			return conteudo;
		}
			
	}
	
	public static String Write() {
		
		
		return "";
	}
			
}










