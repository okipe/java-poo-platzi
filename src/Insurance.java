public class Insurance {
    String nameInsurance;

    Insurance(String temporalNameInsurance) {
        System.out.println("El nombre provisional del seguro es " + temporalNameInsurance);
        this.nameInsurance = temporalNameInsurance;
    }

    public void showNameInsurance() {
        System.out.println("El seguro permanente es " + nameInsurance);
    }
}
