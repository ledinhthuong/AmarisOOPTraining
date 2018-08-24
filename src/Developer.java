public class Developer extends Employee {
    private String Department = "IT";
    @Override
    void declareSickLeave() {
        System.out.println("Sick leave requested by Dev must be validated by "+Department+" Manager");
    }
}
