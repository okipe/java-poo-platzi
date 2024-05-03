import java.util.Date;

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

        Insurance insurance1 = new Insurance("Rimac Seguros", "Perú");
        insurance1.showNameInsurance();


        // showMenu();
        */
        Doctor myDoctor = new Doctor("Leslye Suárez", "Psicología");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointment());

        for (Doctor.AvailableAppointment aAppointment: myDoctor.getAvailableAppointment()) {
            System.out.println(aAppointment.getDate() + " " + aAppointment.getTime());
        }
        
        /*
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        // b = 0
        */

        /*System.out.println("\nPatient:");
        Patient patient = new Patient("Alejandra", "hola@alejandra.com");
        Patient patient2 = new Patient("Anahi", "alejandra@gmail.com");

        System.out.println(patient);
        System.out.println(patient2);
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;
        System.out.println("\n");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        /*patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("1234564888");
        System.out.println(patient.getPhoneNumber());
         */

    }
}