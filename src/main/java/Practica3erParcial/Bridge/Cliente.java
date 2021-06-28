package Practica3erParcial.Bridge;

public class Cliente {
    public static void main(String[] args){
        IEmpresa electrica = new InstalacionElectrica(117,"Paul Flores","Omar Hakim",150,new PagoPresencial());
        electrica.instalacion();

        IEmpresa alcantarillado = new InstalacionDeAlcantarillado(118,"Erwin Flores","Raul Hakim",700,new PagoAplicacion());
        alcantarillado.instalacion();

        IEmpresa agua = new InstalacionDeAgua(119,"Manuel Villaroel","Javier Vargas",500,new PagoTransferencia());
        agua.instalacion();

        IEmpresa electrica2 = new InstalacionElectrica(120,"Gabriela Mamani","Omar Hakim",800,new PagoTigoMoney());
        electrica2.instalacion();

        IEmpresa alcantarillado2 = new InstalacionDeAlcantarillado(121,"Jose Ramos","Cristiano Ronaldo",800,new PagoNuevoMetodo("Intervención divina",0.9));
        alcantarillado2.instalacion();
    }
}
