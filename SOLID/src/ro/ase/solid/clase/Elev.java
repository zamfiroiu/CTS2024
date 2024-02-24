package ro.ase.solid.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte  + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int finantare() {
		int s=30;
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
		return s;
	}
	
}
