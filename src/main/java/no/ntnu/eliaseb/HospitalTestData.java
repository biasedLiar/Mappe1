package no.ntnu.eliaseb;

/**
 * This class doesn't represent anything, but is rather used to fill the hospital with data.
 */
public final class HospitalTestData {
    /**
     * Would create a HospitalTestData object, but is never called.
     */
    private HospitalTestData() {
        // not called
    }
    /**
     * Fills a hospital with data.
     * @param hospital The hospital we are filling with test data
     */
    public static void fillRegisterWithTestData(final Hospital hospital) {
        // Add some departments
        Department emergency = new Department("Akutten");
            emergency.getEmployees().add(new Employee("Odd Even", "Primtallet", ""));
        emergency.getEmployees().add(new Employee("Huppasahn", "DelFinito", ""));
        emergency.getEmployees().add(new Employee("Rigmor", "Mortis", ""));
        emergency.getEmployees().add(new GeneralPractitioner("Inco", "Gnito", ""));
        emergency.getEmployees().add(new Surgeon("Inco", "Gnito", ""));
        emergency.getEmployees().add(new Nurse("Nina", "Teknologi", ""));
        emergency.getEmployees().add(new Nurse("Ove", "Ralt", ""));
        emergency.getPatients().add(new Patient("Inga", "Lykke", ""));
        emergency.getPatients().add(new Patient("Ulrik", "Smål", ""));
        hospital.getDepartments().add(emergency);
        Department childrenPolyclinic = new Department("Barn poliklinikk");
        childrenPolyclinic.getEmployees().add(new Employee("Salti", "Kaffen", ""));
        childrenPolyclinic.getEmployees().add(new Employee("Nidel V.", "Elvefølger", ""));
        childrenPolyclinic.getEmployees().add(new Employee("Anton", "Nym", ""));
        childrenPolyclinic.getEmployees().add(new GeneralPractitioner("Gene", "Sis", ""));
        childrenPolyclinic.getEmployees().add(new Surgeon("Nanna", "Na", ""));
        childrenPolyclinic.getEmployees().add(new Nurse("Nora", "Toriet", ""));
        childrenPolyclinic.getPatients().add(new Patient("Hans", "Omvar", ""));
        childrenPolyclinic.getPatients().add(new Patient("Laila", "La", ""));
        childrenPolyclinic.getPatients().add(new Patient("Jøran", "Drebli", ""));
        hospital.getDepartments().add(childrenPolyclinic);
    }
}