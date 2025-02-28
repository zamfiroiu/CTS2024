package factory_method.fabrici;

import factory_method.clase.CazareCabana;
import factory_method.clase.CazareHotel;
import factory_method.clase.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        return switch (tip){
            case TipPachetCazare.CazareCabana -> new CazareCabana();
            case TipPachetCazare.CazareHotel -> new CazareHotel();
            default -> null;
        };
    }
}
