package no.ntnu.eliaseb;

import java.util.Objects;

/**
 * This class represents a General practitioner, which is a subclass of Doctor.
 * It inherits the fields first name, last name and social security number from Doctor.
 */
public class GeneralPractitioner extends Doctor{
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets the diagnosis for a patiant
     * @param patient the patient we are diagnosing
     * @param diagnosis the diagnosis we are giving the patient
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        if (!Objects.isNull(patient)) {
            patient.setDiagnosis(diagnosis);
        }
    }

    /**
     * Creates a string consisting of the values of all the general practitioner's fields.
     * @return the created string.
     */
    @Override
    public String toString() {
        return "GeneralPractitioner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    /**
     * checks if the general practitioner is equal to another object.
     * @param o the object we are checking against.
     * @return true if they are equal, false if they are not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    /**
     * creates the hashcode for the general practitioner.
     * @return the hashcode for the general practitioner.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
