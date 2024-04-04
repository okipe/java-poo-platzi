import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Anahi Salgado");
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();

        UIMenu.showMenu();
    }
}