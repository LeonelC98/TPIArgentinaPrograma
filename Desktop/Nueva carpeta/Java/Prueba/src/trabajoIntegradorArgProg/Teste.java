package trabajoIntegradorArgProg;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Teste {
	public static void main(String[] arg) {
		int puntuacion = 0;
		String resultados = "C:\\Users\\Costillitas\\Desktop\\Nueva carpeta\\Java\\Prueba\\src\\trabajoIntegradorArgProg\\Resultados";
		Ronda ronda = new Ronda("1", Paths.get(resultados));
		
		System.out.println(ronda.toString());
	}
}
