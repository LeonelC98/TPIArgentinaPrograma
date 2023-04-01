package trabajoIntegradorArgProg;


public class Pronosticos {
	private Equipo equipo;
	private ResultadoEnum resultado;
	
	public Pronosticos(String equipo, boolean gano1, boolean empate, boolean gano2) {
		this.equipo = new Equipo(equipo);
		this.resultado = new ResultadoEnum(gano1,empate,gano2);
	}

	
	public int puntos() {
		return 1;
		
	}
}
