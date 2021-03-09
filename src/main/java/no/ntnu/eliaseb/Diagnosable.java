package no.ntnu.eliaseb;

/**
 * This interface lets something be diagnosable, and gives it the setDiagnosis method.
 */
public interface Diagnosable {
    /**
     * Sets the diagnosis for a the diagnosible object.
     * @param diagnosis The diagnosis being set.
     */
    void setDiagnosis(String diagnosis);

}
