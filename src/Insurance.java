public class Insurance {
    String nameInsurance;
    String insuranceCountry;

    Insurance(String temporalNameInsurance, String tempInsuranceCountry) {
        System.out.println("El nombre provisional del seguro es " + temporalNameInsurance + " y es de " + temporalNameInsurance);
        this.nameInsurance = temporalNameInsurance;
        this.insuranceCountry = tempInsuranceCountry;
    }

    public void showNameInsurance() {
        System.out.println("El seguro permanente es " + nameInsurance);
        System.out.println("El país de dicho seguro es " + insuranceCountry);
    }
}
