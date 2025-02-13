package co.edu.uniquindio.poo.biblioteca1_0.model;

public enum TipoMaterial {
    LIBRO{
        @Override
        public double calcularTarifa() {
            return 2.0;
        }

    }, REVISTA{
        @Override
        public double calcularTarifa() {
            return 1.5;
        }

    };


    public abstract double calcularTarifa();
}
