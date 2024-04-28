import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*
        Doctor myDoctor = new Doctor("Anahí Salgado");
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();

        Hospital myHospital = new Hospital("María Auxiliadora");
        myHospital.nameHospital = "Arzobispo Loayza";
        myHospital.showNameHospital();
 */
        Insurance insurance1 = new Insurance("Rimac Seguros", "Perú");
        insurance1.showNameInsurance();


        // showMenu();
        Doctor myDoctor = new Doctor("Leslye Suárez", "Psicología");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        System.out.println("\nPatient:");
        Patient patient = new Patient("Alejandra", "hola@alejandra.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("1234564888");
        System.out.println(patient.getPhoneNumber());

    }
;}