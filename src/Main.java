import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Anahí Salgado");
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();

        Hospital myHospital = new Hospital("María Auxiliadora");
        myHospital.nameHospital = "Arzobispo Loayza";
        myHospital.showNameHospital();

        Insurance insurance1 = new Insurance("Rimac Seguros");
        insurance1.showNameInsurance();
        insurance1.nameInsurance = "Pacífico Seguros";
        insurance1.showNameInsurance();

        showMenu();


    }
}