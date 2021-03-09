package no.ntnu.eliaseb;

import java.util.Objects;

/**
 * This class represents a person and is abstract. It has fields for first name, last name, and social security number.
 */
public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    /**
     * Creates a person with first name, last name and social security number.
     * @param firstName The first name of the person
     * @param lastName The last name of the person
     * @param socialSecurityNumber The social security number of the person.
     */
    public Person(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Gets the first name of the person.
     * @return The first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the person
     * @param firstName the new first name of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * gets the last name of the person.
     * @return the last name of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets the last name of the person
     * @param lastName the new last name of the person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * gets the social security number of the person
     * @return the social security number of the person
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets a new social security number.
     * @param socialSecurityNumber The new social security number.
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * gets the Person's full name.
     * @return The full name of the person
     */
    public String getFullName(){
        return lastName + ", " + firstName;
    }

    /**
     * Checks if the Person is equal to another Object.
     * @param o the object we are checking against.
     * @return True if they are the same person, false if they are not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(socialSecurityNumber, person.socialSecurityNumber);
    }

    /**
     * Generates a hashcode for the two objects
     * @return the generated hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Creates the toString for the person, showing all fields.
     * @return The toString of the person
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
