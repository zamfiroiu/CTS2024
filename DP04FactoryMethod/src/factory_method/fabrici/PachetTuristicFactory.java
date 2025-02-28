package factory_method.fabrici;

import factory_method.clase.PachetTuristic;

public interface PachetTuristicFactory {
    PachetTuristic crearePachet(TipPachetTuristic tip);
}
