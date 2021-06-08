package chainOfResponsability.ejercicio.ejercicio2;

public class Persona {
    private String nombre;
    private boolean certificadoDeNacimiento;
    private boolean ficha;
    private boolean pagoAlBanco;


    public Persona(String nombre, boolean certificadoDeNacimiento, boolean ficha, boolean pagoAlBanco) {
        this.nombre = nombre;
        this.certificadoDeNacimiento = certificadoDeNacimiento;
        this.ficha = ficha;
        this.pagoAlBanco = pagoAlBanco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCertificadoDeNacimiento() {
        return certificadoDeNacimiento;
    }

    public void setCertificadoDeNacimiento(boolean certificadoDeNacimiento) {
        this.certificadoDeNacimiento = certificadoDeNacimiento;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }

    public boolean isPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(boolean pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public void showInfo(){
        System.out.println("Nombre:"+nombre);

        if(certificadoDeNacimiento){
            System.out.println("Certificado de Nacimiento: Si");
        }else{
            System.out.println("Certificado de Nacimiento: No");
        }
        if(ficha){
            System.out.println("Ficha: Si");
        }else{
            System.out.println("Ficha: No");
        }
        if(pagoAlBanco){
            System.out.println("Pago al banco: Si");
        }else{
            System.out.println("Pago al banco: No");
        }
        System.out.println("*******************************");
    }
}
