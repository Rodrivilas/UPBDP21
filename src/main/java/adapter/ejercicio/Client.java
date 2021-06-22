package adapter.ejercicio;

public class Client {
    public static void main(String[]args){
        Celular celular =new Celular("Sony xperia",950,"2 años");
        celular.precio();
        celular.tiempoDeVida();

        Tablet tablet =new Tablet("iPad",2300,"3 meses");
        tablet.precio();
        tablet.tiempoDeVida();

        Computadora computadora =new Computadora("Razer",4500,"6 meses");
        computadora.precio();
        computadora.tiempoDeVida();

        Refrigerador refrigerador=new Refrigerador("Philips Xsdkdk1000",4600,"2 años");
        refrigerador.costo();
        refrigerador.tiempoDeGarantia();

        Televisor televisor=new Televisor("Samsung 8k 120fps",7600,"1 año");
        televisor.costo();
        televisor.tiempoDeGarantia();

        Lavadora lavadora=new Lavadora("LG100WASHER",3000,"5 años");
        lavadora.costo();
        lavadora.tiempoDeGarantia();

        ElectronicosAdapterObject e =new ElectronicosAdapterObject(refrigerador,televisor,lavadora);
        e.precio();
        e.tiempoDeVida();
    }
}
