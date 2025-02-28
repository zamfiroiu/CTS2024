package factory_method.program;

import factory_method.clase.PachetTuristic;
import factory_method.fabrici.*;

public class Program {
    public static void main(String[] args) {
        PachetTuristicFactory fabrica=new CazareFactory();
        PachetTuristicFactory fabricaTransport=new TransportFactory();

        PachetTuristic pachet=fabrica.crearePachet(TipPachetCazare.CazareCabana);
        pachet.afisareDescriere();
        pachet=fabricaTransport.crearePachet(TipPachetTransport.TransportMicrobuz);
        pachet.afisareDescriere();
    }
}
