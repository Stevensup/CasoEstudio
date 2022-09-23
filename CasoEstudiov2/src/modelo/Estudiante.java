package modelo;

public class Estudiante {

	private String NombreE;
	private String Documento;

	public Estudiante(String pNombreE, String pDocumento) {

		this.NombreE = pNombreE;
		this.Documento = pDocumento;

	}

	public String getNombreE() {
		return NombreE;
	}

	public String getDocumento() {
		return Documento;
	}
}