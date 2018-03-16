package TareaTema12;

public class Direccion {
	
	private String calle;
	private int numero;
	private int cp;
	private String provincia;
	
	 //Hacemos ahora un constructor que recibe por dato los 4 par�metros

	public Direccion(String calle, int numero, int cp, String provincia) {
		
		//almacenar el valor del parametro dentro del campo de clase
		this.calle=calle;
		this.numero=numero;
		this.cp=cp;
		this.provincia=provincia;
	}
	
	//Realizar los m�todos
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "\nCalle= " + getCalle() + "\nN�mero= " + getNumero() + "\nCp= " + getCp() + "\nProvincia= " + getProvincia();
	}
	
	
	

}

     