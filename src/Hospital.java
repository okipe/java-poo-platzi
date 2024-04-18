public class Hospital {
    String nameHospital;

    Hospital (String nameHospital) {
        System.out.println("El nombre del hospital que no se guarda en memoria es: " + nameHospital);
    }

    public void showNameHospital() {
        System.out.println("El hospital que permanece en memoria es: " + nameHospital + "\nEl anterior no se guardó");
    }
}
