public class DeclareSickLeave {
    public static void main(String[] args) {
        Employee Dev = new Developer();
        Dev.declareSickLeave();

        Employee HRO = new RecruitmentOfficer();
        HRO.declareSickLeave();
    }
}
