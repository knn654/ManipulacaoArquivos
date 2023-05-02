package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {
	
	
	public ArquivosController() {
		super();
	}

	@Override
	public void readFile(String path, String arquivo) throws IOException {
			File arq = new File(path, arquivo);
			if (arq.exists() && arq.isFile()) {
				FileInputStream fluxo = new FileInputStream(arq);
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				System.out.println("Frutas: ");
				while (linha != null) {
					//System.out.println(linha);
					//linha = buffer.readLine();
					String[] vetLinha = linha.split(",");
					if (vetLinha[2].contains("Fruits") || vetLinha[2].contains("fruits")) {
						System.out.println(vetLinha[0] + "\t\t" + 
							vetLinha[1] + "\t\t\t\t" +
									vetLinha[3]);
					
						linha = buffer.readLine();
					} else {
						linha = buffer.readLine();
					}
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} else {
				throw new IOException("Arquivo inválido!!!");
			}
		}


}