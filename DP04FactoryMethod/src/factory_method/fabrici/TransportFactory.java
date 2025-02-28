package factory_method.fabrici;

import factory_method.clase.PachetTuristic;
import factory_method.clase.TransportAutobuz;
import factory_method.clase.TransportMicrobuz;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        return switch (tip){
            case TipPachetTransport.TransportAutobuz -> new TransportAutobuz();
            case TipPachetTransport.TransportMicrobuz -> new TransportMicrobuz();
            default -> null;
        };
    }
}
