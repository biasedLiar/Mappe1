package no.ntnu.eliaseb;

public class HospitalClient {
    public static void main(String[] args) {

        System.out.println("Hello Worldtestf Sistesdf sjekk");
        Surgeon surg = new Surgeon("Elias", "Baird", "234234234");
        System.out.println(surg);
        Department dep = new Department("Haukeland sykehus.");
        dep.addEmployee(surg);
        System.out.println(dep);
        try {
            dep.remove(surg);
        } catch (RemoveException e){
            System.out.println(e);
        }
        System.out.println(dep);
        try {
            dep.remove(surg);
        } catch (RemoveException e){
            System.out.println(e);
        }
        System.out.println(dep);
    }
}
