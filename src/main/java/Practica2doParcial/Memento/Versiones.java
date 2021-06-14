package Practica2doParcial.Memento;

public class Versiones {
    private int version;
    private boolean portada;
    private boolean resumen;
    private boolean introduccion;
    private boolean marcoTeorico;
    private boolean metodologia;
    private boolean resultados;
    private boolean conclusiones;
    private boolean referencias;
    private boolean anexos;

    public Versiones(int version, boolean portada, boolean resumen, boolean introduccion, boolean marcoTeorico, boolean metodologia, boolean resultados, boolean conclusiones, boolean referencias, boolean anexos) {
        this.version = version;
        this.portada = portada;
        this.resumen = resumen;
        this.introduccion = introduccion;
        this.marcoTeorico = marcoTeorico;
        this.metodologia = metodologia;
        this.resultados = resultados;
        this.conclusiones = conclusiones;
        this.referencias = referencias;
        this.anexos = anexos;
    }

    public boolean isPortada() {
        return portada;
    }

    public void setPortada(boolean portada) {
        this.portada = portada;
    }

    public boolean isResumen() {
        return resumen;
    }

    public void setResumen(boolean resumen) {
        this.resumen = resumen;
    }

    public boolean isIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(boolean introduccion) {
        this.introduccion = introduccion;
    }

    public boolean isMarcoTeorico() {
        return marcoTeorico;
    }

    public void setMarcoTeorico(boolean marcoTeorico) {
        this.marcoTeorico = marcoTeorico;
    }

    public boolean isMetodologia() {
        return metodologia;
    }

    public void setMetodologia(boolean metodologia) {
        this.metodologia = metodologia;
    }

    public boolean isResultados() {
        return resultados;
    }

    public void setResultados(boolean resultados) {
        this.resultados = resultados;
    }

    public boolean isConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(boolean conclusiones) {
        this.conclusiones = conclusiones;
    }

    public boolean isReferencias() {
        return referencias;
    }

    public void setReferencias(boolean referencias) {
        this.referencias = referencias;
    }

    public boolean isAnexos() {
        return anexos;
    }

    public void setAnexos(boolean anexos) {
        this.anexos = anexos;
    }

    public void showInfo(){
        System.out.println("Versión:"+version);
        if(portada){
            System.out.println("Portada completada");
        }else{
            System.out.println("Falta portada");
        }
        if (resumen){
            System.out.println("Resumen completado");
        }else{
            System.out.println("Falta resumen");
        }
        if (introduccion){
            System.out.println("Introducción completada");
        }else{
            System.out.println("Falta introducción");
        }
        if (marcoTeorico){
            System.out.println("Marco teórico comletado");
        }else{
            System.out.println("Falta marco teórico");
        }
        if(metodologia){
            System.out.println("Metodología completada");
        }else{
            System.out.println("Falta metodología");
        }
        if(resultados){
            System.out.println("Resultados completados");
        }else{
            System.out.println("Falta resultados");
        }
        if(conclusiones){
            System.out.println("Conclusiones completado");
        }else{
            System.out.println("Falta conclusión");
        }
        if(referencias){
            System.out.println("Referencias completado");
        }else{
            System.out.println("Faltan referencias");
        }
        if(anexos){
            System.out.println("Anexos completados");
        }else{
            System.out.println("Faltan anexos");
        }
    }
}
