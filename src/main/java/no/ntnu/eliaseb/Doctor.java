package no.ntnu.eliaseb;

public abstract class Doctor extends Employee{

    /**
     * Creates a new Doctor object.
     * @param firstName the first name of the doctor.
     * @param lastName the last name of the doctor.
     * @param socialSecurityNumber the social security number of the doctor.
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets a diagnosis for a patient.
     * @param patient the patient we are setting the diagnosis for
     * @param diagnosis the diagnosis the patient is getting.
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);


    @Override
    public String toString() {
        return "Doctor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
