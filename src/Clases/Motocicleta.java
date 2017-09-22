/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 21/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package Clases;

public class Motocicleta extends Vehiculo{
	private Persona acompa�ante;
		
	public Motocicleta(){
		super();
	}
	
	private String getAcompa�ante() {
		return acompa�ante.getNombre();
	}
	public Boolean cambiarChofer(Persona Chofer) {
		if(this.hayAcompa�ante()) return Boolean.FALSE;
		super.cambiarChofer(Chofer);
		return Boolean.TRUE;
	}
	public Boolean hayAcompa�ante() {
		return this.getAcompa�ante()!=null;
	}
	public static void main(String[] args) {
		Motocicleta Yamaha = new Motocicleta();
		Yamaha.setChofer(new Persona("Calenton"));
		Yamaha.acompa�ante = new Persona("Amigo del Calenton");
		Yamaha.setCantidadDeKilometros(3.5);
		System.out.println("Chofer: " + Yamaha.getChofer() +" Acompa�ante: " + Yamaha.getAcompa�ante() + " Kilometros recorridos: "+ Yamaha.getCantidadDeKilometros());
		Yamaha.cambiarChofer(new Persona("Miguel"));
		System.out.println("Chofer: " + Yamaha.getChofer() +" Acompa�ante: " + Yamaha.getAcompa�ante() + " Kilometros recorridos: "+ Yamaha.getCantidadDeKilometros());
	}
}
