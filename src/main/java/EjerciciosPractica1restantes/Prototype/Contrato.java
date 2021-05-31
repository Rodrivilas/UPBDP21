package EjerciciosPractica1restantes.Prototype;

public class Contrato implements IContrato{
    private int sueldo;
    private int carga_horaria;
    private boolean curso_Educación_Superior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;
    private String Nombre;
    private String Apellido;

    public Contrato() {
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public boolean isCurso_Educación_Superior() {
        return curso_Educación_Superior;
    }

    public void setCurso_Educación_Superior(boolean curso_Educación_Superior) {
        this.curso_Educación_Superior = curso_Educación_Superior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }

    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }

    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public Object clone() {
        Contrato contrato =new Contrato();
        contrato.setSueldo(this.sueldo);
        contrato.setCarga_horaria(this.carga_horaria);
        contrato.setAccesoPlataforma(this.accesoPlataforma);
        contrato.setApellido(this.Apellido);
        contrato.setMarcadoHoraEntrada(this.marcadoHoraEntrada);
        contrato.setMarcadoHoraSalida(this.marcadoHoraSalida);
        contrato.setCurso_Educación_Superior(this.curso_Educación_Superior);
        contrato.setNombre(this.Nombre);
        contrato.setMarcadoBiometrico(this.marcadoBiometrico);

        return contrato;
    }
    public void ShowInformation(){
        System.out.println("***********************");
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: "+Apellido);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("curso_Educación_Superior: "+curso_Educación_Superior);
        System.out.println("accesoPlataforma: "+accesoPlataforma);
        System.out.println("marcadoBiometrico: "+marcadoBiometrico);
        System.out.println("carga_horaria: "+carga_horaria);
        System.out.println("marcadoHoraEntrada: "+marcadoHoraEntrada);
        System.out.println("marcadoHoraSalida: "+marcadoHoraSalida);
    }
}
