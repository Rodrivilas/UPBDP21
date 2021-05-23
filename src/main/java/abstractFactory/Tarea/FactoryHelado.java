package abstractFactory.Tarea;

public abstract class FactoryHelado {
    public enum tipohelado{
        HELADOAGUA,
        HELADOCREMA,
        HELADOMIXTO
    }

    public static IHelado make(tipohelado tipo){
        IHelado helado;
        switch (tipo){
            case HELADOAGUA:
                helado=new HeladoAgua();
                ((HeladoAgua)helado).setBase(new Base("palito","L","madera","30"));
                ((HeladoAgua)helado).setFruta(new Fruta("jugosa","naranja","10","grande"));
                ((HeladoAgua)helado).setForma("cuadrado");
                ((HeladoAgua)helado).setTamano("grande");
                break;
            case HELADOCREMA:
                helado=new HeladoCrema();
                ((HeladoCrema)helado).setBase(new Base("cono","XL","Galleta","70"));
                ((HeladoCrema)helado).setFruta(new Fruta("jugosa","frutillas","20","medianas"));
                ((HeladoCrema)helado).setForma("cono");
                ((HeladoCrema)helado).setTamano("muy grande");
                ((HeladoCrema)helado).setCrema(new Crema("dulce","20","Delizia"));
                break;
            case HELADOMIXTO:
                helado=new HeladoMixto();
                ((HeladoMixto)helado).setBase(new Base("canasta","XL","plástico","10"));
                ((HeladoMixto)helado).setFruta(new Fruta("jugosa","Durazno","10","grande"));
                ((HeladoMixto)helado).setForma("canasta");
                ((HeladoMixto)helado).setTamano("muy grande");
                ((HeladoMixto)helado).setCrema(new Crema("dulce","30","PIL"));
                ((HeladoMixto)helado).setCosto("80");

                break;
            default:
                helado=new HeladoAgua();
                ((HeladoAgua)helado).setBase(new Base("palito","L","madera","30"));
                ((HeladoAgua)helado).setFruta(new Fruta("jugosa","naranja","10","grande"));
                ((HeladoAgua)helado).setForma("cuadrado");
                ((HeladoAgua)helado).setTamano("grande");
                break;
        }
       return helado;
    }
}
