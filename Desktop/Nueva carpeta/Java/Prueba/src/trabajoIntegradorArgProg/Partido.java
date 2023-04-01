package trabajoIntegradorArgProg;

public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	public Partido(String equipo1, String equipo2, String golesEquipo1,String golesEquipo2) {
		this.equipo1 = new Equipo(equipo1);
		this.equipo2 = new Equipo(equipo2);
		this.golesEquipo1 = Integer.valueOf(golesEquipo1);
		this.golesEquipo2 = Integer.valueOf(golesEquipo2);
		
	}

	public ResultadoEnum resultado() {
		ResultadoEnum resultados = new ResultadoEnum();
		if(golesEquipo1>golesEquipo2) {
			resultados = new ResultadoEnum(true,false,false);
		}else if(golesEquipo1<golesEquipo2) {
			resultados = new ResultadoEnum(false,false,true);
		}else if(golesEquipo1 == golesEquipo2) {
			resultados = new ResultadoEnum(false,true,false);
		}
		
		return resultados;
		
	}

	@Override
	public String toString() {
		return "Partido [equipo1=" + equipo1.getNombre() + ", equipo2=" + equipo2.getNombre() + ", golesEquipo1=" + golesEquipo1
				+ ", golesEquipo2=" + golesEquipo2 + "]\n";
	}
	
	
	
}
