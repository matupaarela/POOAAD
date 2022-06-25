package main.poo.e002;

public class Planeta {
    private String nombre = null;
    private int cantidadDeSatelites = 0;
    private double masaKG = 0;
    private double volumenKMCubicos = 0;
    private int diametroKM = 0;
    private int distanciaAlSolMilesKM = 0;
    private enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    private tipoPlaneta tipo;
    private boolean observableSimpleVista = false;

    public Planeta(String nombre, int cantidadDeSatelites, double masaKG, double volumenKMCubicos, int diametroKM, int distanciaAlSolMilesKM, tipoPlaneta tipo, boolean observableSimpleVista) {
        this.nombre = nombre;
        this.cantidadDeSatelites = cantidadDeSatelites;
        this.masaKG = masaKG;
        this.volumenKMCubicos = volumenKMCubicos;
        this.diametroKM = diametroKM;
        this.distanciaAlSolMilesKM = distanciaAlSolMilesKM;
        this.observableSimpleVista = observableSimpleVista;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadDeSatelites=" + cantidadDeSatelites +
                ", masaKG=" + masaKG +
                ", volumenKMCubicos=" + volumenKMCubicos +
                ", diametroKM=" + diametroKM +
                ", distanciaAlSolMilesKM=" + distanciaAlSolMilesKM +
                ", observableSimpleVista=" + observableSimpleVista +
                ", tipoPlaneta=" + tipoPlaneta.GASEOSO +
                '}';
    }
}