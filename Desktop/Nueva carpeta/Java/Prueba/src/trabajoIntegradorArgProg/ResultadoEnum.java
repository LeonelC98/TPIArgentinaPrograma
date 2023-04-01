package trabajoIntegradorArgProg;

public class ResultadoEnum {
	
	public boolean gano1;
	public boolean empate;
	public boolean gano2;
	
	public ResultadoEnum(boolean gano1,boolean empate,boolean gano2) {
		this.gano1 = gano1;
		this.empate = empate;
		this.gano2 = gano2;
	}
	public ResultadoEnum() {
		this.gano1 = false;
		this.empate = false;
		this.gano2 = false;
	}
	public boolean isGano1() {
		return gano1;
	}
	public boolean isEmpate() {
		return empate;
	}
	public boolean isGano2() {
		return gano2;
	}
}
