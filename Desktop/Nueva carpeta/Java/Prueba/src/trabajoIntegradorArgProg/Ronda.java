package trabajoIntegradorArgProg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Ronda {
	private String nro;
	private Partido[] partido = new Partido[5];
	
	public Ronda(String nro,Path archivo) {
		this.nro = nro;
		try {
			int index = 0;
			for(String line: Files.readAllLines(archivo)) {
				String[] var = line.split(",");

				partido[index] = new Partido(var[0],var[3],var[1],var[2]);
				index++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public int puntos() {
		return 0;
	}

	@Override
	public String toString() {
		return "Ronda [nro=" + nro + ", partido=\n" + Arrays.toString(partido) + "]";
	}




}
