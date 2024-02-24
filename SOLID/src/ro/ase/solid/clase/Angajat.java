package ro.ase.solid.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	
	public int finantare() {
		int s=10;
		// TODO Auto-generated method stub
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
		return s;
	}
	
}
