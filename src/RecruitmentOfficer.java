public class RecruitmentOfficer extends Employee{
    private String Department = "HR";
    @Override
    void declareSickLeave() {
        System.out.println("Sick Leave requested by HRO must be validated by "+Department+" Manager");
    }
}
