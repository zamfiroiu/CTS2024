package ro.ase.solid.program;

import ro.ase.solid.clase.Angajat;
import ro.ase.solid.clase.Utils;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = Utils.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
