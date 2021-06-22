package adapter.ejercicio;

public class ElectronicosAdapterObject implements IElectronicoA{
    private Refrigerador refrigerador;
    private Televisor televisor;
    private Lavadora lavadora;


    public ElectronicosAdapterObject(Refrigerador refrigerador, Televisor televisor, Lavadora lavadora) {
        this.refrigerador = refrigerador;
        this.televisor = televisor;
        this.lavadora = lavadora;
    }

    @Override
    public void precio() {
        System.out.println();
        System.out.println(refrigerador.getModelo()+" cuesta: "+refrigerador.getCosto()+"$us");
        System.out.println(televisor.getModelo()+" cuesta: "+televisor.getCosto()+"$us");
        System.out.println(lavadora.getModelo()+" cuesta: "+lavadora.getCosto()+"$us");

    }

    @Override
    public void tiempoDeVida() {
        System.out.println();
        System.out.println("El "+refrigerador.getModelo()+" esta en el mercado desde hace: "+refrigerador.getTiempoDeGarantia());
        System.out.println("El "+televisor.getModelo()+" esta en el mercado desde hace: "+televisor.getTiempoDeGarantia());
        System.out.println("El "+lavadora.getModelo()+" esta en el mercado desde hace: "+lavadora.getTiempoDeGarantia());
    }
}
