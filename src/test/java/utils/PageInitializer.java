package utils;

public class PageInitializer {

    public static LoginAdminPage loginAdminPage;
    public static DashboardPage dash;
    public static AddEmployeePage addEmployee;
    public static EmployeeListPage employeeListPage;
    public static AddLicensePage addEmpLicense;
    public static DependantsPage dependant;
    public static EmergencyContactsPage emergencyContact;
    public static EmployeeListPage empList;
    public static JobPage job;
    public static LanguagesPage language;
    public static MembershipsPage membership;
    public static PersonalDetailsPage pDetails;
    public static QualificationsPage qualification;
    public static SkillsPage skills;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dash = new DashboardPage();
        addEmployee = new AddEmployeePage();
        addEmpLicense = new AddLicensePage();
        dependant = new DependantsPage();
        emergencyContact = new EmergencyContactsPage();
        empList = new EmployeeListPage();
        job = new JobPage();
        language = new LanguagesPage();
        membership = new MembershipsPage();
        empList = new EmployeeListPage();
        pDetails = new PersonalDetailsPage();
        qualification = new QualificationsPage();
        skills = new SkillsPage();
    }
}
