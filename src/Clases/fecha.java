/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.2 10/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */

package Clases;

public class fecha{
	private Integer dia;
	private Integer mes;
	private Integer a�o;
	private Integer diamax;
	public fecha(){
		this.dia = null;
		this.mes = null;
		this.a�o = null;
	}
	public fecha(int dia, int mes, int a�o){
		if(validador(dia, mes, a�o)) {
			this.a�o = a�o;
			this.dia = dia;
			this.mes = mes;
		}else {
			System.out.println("Fecha invalida");
			this.dia = null;
			this.mes = null;
			this.a�o = null;
		}
	}

	public Boolean validador(int dia, int mes,  int a�o) {
		int diamax = 0;
		switch(mes) {
		case 1:{
			diamax = 31;
			break;
		}
		case 2:{
			diamax = 28;
			break;
		}
		case 3:{
			diamax = 31;
			break;
		}
		case 4:{
			diamax = 30;
			break;
		}
		case 5:{
			diamax = 31;
			break;
		}
		case 6:{
			diamax = 30;
			break;
		}
		case 7:{
			diamax = 31;
			break;
		}
		case 8:{
			diamax = 31;
			break;
		}
		case 9:{
			diamax = 30;
			break;
		}
		case 10:{
			diamax = 31;
			break;
		}
		case 11:{
			diamax = 30;
			break;
		}
		case 12:{
			diamax = 31;
			break;
		}
		default:{
			diamax = 0;
		}
		}
		if((((2016-a�o)%4) == 0) && mes == 2) {
			if(dia>0 && dia<=29){
				this.diamax = 29;
				return true;
			}
		}else {
			if(dia>0&&dia<=diamax && mes>0 && mes<=12){
				this.diamax = diamax;
				return true;
			}
		}
		return false;
	}

	public boolean esAnterior(fecha f) {
		if(this.a�o==f.a�o&&this.mes==f.mes&&this.dia==f.mes) return false;
		if(this.a�o<=f.a�o&&this.mes<=f.mes&&this.dia<f.dia) return false;
		if(this.a�o==f.a�o && this.mes <= f.mes) {
			if((this.dia == this.diamax) && f.dia == 1) {
				return true;
			}else {
				if(this.dia - f.dia == 1) {
					return true;
				}else {
					return false;
				}
			}
		}
		else {
			if(this.a�o<f.a�o && this.mes > f.mes) {
				if((this.dia == this.diamax) && f.dia == 1) {
					return true;
				}else {
					if(this.dia - f.dia == 1) {
						return true;
					}else {
						return false;
					}
				}
			}
		}
		return false;
	}

	public String Mostrafecha() {
		return "("+ this.MostrarDia() +"/"+ this.MostrarMes() + "/" + this.MostrarA�o() +")";
	}
	public Integer MostrarDia() {
		return this.dia;
	}
	public Integer MostrarMes() {
		return this.mes;
	}
	public Integer MostrarA�o() {
		return this.a�o;
	}
	public static void main(String[] args) {
		fecha verdadero1 = new fecha(7,9,2017);
		fecha verdadero2 = new fecha(6,9,2017);
		fecha verdadero3 = new fecha(30,9,2017);
		fecha verdadero4 = new fecha(1,10,2017);
		fecha verdadero5 = new fecha(31,12,2017);
		fecha verdadero6 = new fecha(1,1,2018);
		fecha falso1 = new fecha(4,10,2017);
		fecha falso2 = new fecha(8,2,2017);
		fecha falso3 = new fecha(5,1,2018);
		System.out.println(verdadero1.Mostrafecha());
		System.out.println(verdadero1.esAnterior(verdadero2));
		System.out.println(verdadero3.esAnterior(verdadero4));
		System.out.println(verdadero5.esAnterior(verdadero6));
		System.out.println(falso1.esAnterior(verdadero2));
		System.out.println(verdadero3.esAnterior(falso2));
		System.out.println(verdadero5.esAnterior(falso3));
	}

}
