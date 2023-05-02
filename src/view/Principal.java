package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String path = "C:\\temp";
		String arquivo = "generic_food.csv";
		
			try {
				arqCont.readFile(path, arquivo);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}