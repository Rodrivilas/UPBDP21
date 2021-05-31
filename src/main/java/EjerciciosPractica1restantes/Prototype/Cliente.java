package EjerciciosPractica1restantes.Prototype;

public class Cliente {
    public static void main (String[] args){
        Contrato contrato=new Contrato();
        contrato.setSueldo(5000);
        contrato.setCurso_Educación_Superior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setCarga_horaria(80);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("18:00");

        Contrato c1 = (Contrato) contrato.clone();
        c1.setNombre("Jacvier");
        c1.setApellido("Gallardo");

        Contrato c2 = (Contrato) contrato.clone();
        c2.setNombre("Ian");
        c2.setApellido("Pomier");

        Contrato c3 = (Contrato) contrato.clone();
        c3.setNombre("Juan");
        c3.setApellido("García");

        Contrato c4 = (Contrato) contrato.clone();
        c4.setNombre("Rodrigo");
        c4.setApellido("Añez");

        Contrato c5 = (Contrato) contrato.clone();
        c5.setNombre("Manuela");
        c5.setApellido("Galvez");

        Contrato c6 = (Contrato) contrato.clone();
        c6.setNombre("Gabriela");
        c6.setApellido("Zubieta");

        Contrato c7 = (Contrato) contrato.clone();
        c7.setNombre("Anuel");
        c7.setApellido("AA");

        Contrato c8 = (Contrato) contrato.clone();
        c8.setNombre("Travis");
        c8.setApellido("Scott");

        Contrato c9 = (Contrato) contrato.clone();
        c9.setNombre("Noel");
        c9.setApellido("Antequera");

        Contrato c10 = (Contrato) contrato.clone();
        c10.setNombre("Juana");
        c10.setApellido("Vilaseca");

        Contrato c11 = (Contrato) contrato.clone();
        c11.setNombre("Rodolfo");
        c11.setApellido("Paz");

        Contrato c12 = (Contrato) contrato.clone();
        c12.setNombre("David");
        c12.setApellido("Bowie");

        Contrato c13 = (Contrato) contrato.clone();
        c13.setNombre("Anita");
        c13.setApellido("Buenita");

        Contrato c14 = (Contrato) contrato.clone();
        c14.setNombre("Alison");
        c14.setApellido("Candela");

        Contrato c15 = (Contrato) contrato.clone();
        c15.setNombre("Benigno");
        c15.setApellido("Maligno");





        c1.ShowInformation();
        c2.ShowInformation();
        c3.ShowInformation();
        c4.ShowInformation();
        c5.ShowInformation();
        c6.ShowInformation();
        c7.ShowInformation();
        c8.ShowInformation();
        c9.ShowInformation();
        c10.ShowInformation();
        c11.ShowInformation();
        c12.ShowInformation();
        c13.ShowInformation();
        c14.ShowInformation();
        c15.ShowInformation();


    }
}
