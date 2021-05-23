package abstractFactory.Tarea;

public class Cliente {
    public static void main (String []args){
        HeladoAgua h1=(HeladoAgua) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        h1.crear();

        HeladoAgua h2=(HeladoAgua) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        h2.setTamano("pequeño");
        h2.setForma("Cuadrada");
        h2.setBase(new Base("canasta","pequeño","plastico","20"));
        h2.crear();

        HeladoAgua h3=(HeladoAgua) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        h3.setTamano("pequeño");
        h3.setFruta(new Fruta("manzana","manzana","10","medianos"));
        h3.crear();

        HeladoCrema hc1=(HeladoCrema) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        hc1.crear();

        HeladoCrema hc2=(HeladoCrema) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        hc2.setTamano("grande");
        hc2.setForma("canasta");
        hc2.setBase(new Base("canasta","grande","plastico","15"));
        hc2.crear();

        HeladoCrema hc3=(HeladoCrema) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        hc3.setForma("cono");
        hc3.setBase(new Base("cono","grande","plastico","10"));
        hc3.setCrema(new Crema("chocolate","33","PIL"));
        hc3.crear();

        HeladoMixto hm1=(HeladoMixto) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        hm1.crear();

        HeladoMixto hm2=(HeladoMixto) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        hm2.setTamano("XL");
        hm2.setForma("Canasta");
        hm2.setBase(new Base("canasta","XL","galleta de chocolate","40"));
        hm2.setCrema(new Crema("dulce de leche","33","Delizia"));
        hm2.crear();

        HeladoMixto hm3=(HeladoMixto) FactoryHelado.make(FactoryHelado.tipohelado.HELADOAGUA);
        hm3.setTamano("S");
        hm3.setForma("cono");
        hm3.setBase(new Base("cono","S","galleta de chocolate","20"));
        hm3.setCrema(new Crema("leche condensada","10","Delizia"));
        hm3.setCosto("30");
        hm3.crear();

    }
}
