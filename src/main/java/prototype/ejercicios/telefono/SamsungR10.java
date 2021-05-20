package prototype.ejercicios.telefono;

public class SamsungR10 implements Celular{
    private String tamano;
    private String cpu;
    private String versionAndroid;
    private String camara;
    private String memory;
    private String bluetooth;
    private String cantidadDeMemoriasExternas;
    private String tipoBateria;
    private Sim sim;
    private Accesorios acc;

    public SamsungR10(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(String cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public Accesorios getAcc() {
        return acc;
    }

    public void setAcc(Accesorios acc) {
        this.acc = acc;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public Object clone() {
        SamsungR10 objClone=new SamsungR10();
        objClone.setAcc(this.acc);
        objClone.setBluetooth(this.bluetooth);
        objClone.setCpu(this.cpu);
        objClone.setTamano(this.tamano);
        objClone.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
        objClone.setTipoBateria(this.tipoBateria);
        objClone.setSim(this.sim);
        objClone.setVersionAndroid(this.versionAndroid);
        objClone.setCamara(this.camara);
        objClone.setMemory(this.memory);
        return objClone;
    }
    public void showInformation(){
        System.out.println("***********************");
        System.out.println("Tamaño: "+tamano);
        System.out.println("Cpu: "+cpu);
        System.out.println("Memoria: "+memory);
        System.out.println("Nombre de empresa del SIM: "+sim.getNombreEmpresaTel());
        System.out.println("Número del SIM: "+sim.getNumeroTelefono());
        System.out.println("Version De Android: "+versionAndroid);
        System.out.println("Camara: "+camara);
        System.out.println("Bluetooth: "+bluetooth);
        System.out.println("Cantidad De Memorias Externas: "+cantidadDeMemoriasExternas);
        System.out.println("Tipo De Bateria: "+tipoBateria);
        System.out.println("Accesorios Audifono:"+ acc.getAudifono());
        System.out.println("Accesorios Cargador:"+ acc.getCargador());
        System.out.println("Accesorios Estuche:"+ acc.getEstuche());

    }
}
