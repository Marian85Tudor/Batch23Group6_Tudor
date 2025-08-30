package utils;

import Pages.*;

public class PageInitializer {

      public static LoginPage loginPage;
      public static DashboardPage dashboardPage;
        public static AddEmployeePage addEmployeePage;
//    public static EmployeeListPage employeeListPage;
//    public static AddLicensePage addEmpLicense;
//    public static DependantsPage dependant;
//    public static EmergencyContactsPage emergencyContact;
//    public static EmployeeListPage empList;
//    public static JobPage job;
//    public static LanguagesPage language;
//    public static MembershipsPage membership;
//    public static QualificationsPage qualification;
//    public static SkillsPage skills;
      public static SearchEmployeePage searchEmployeePage;
      public static ESSUserDashboardPage essUserDashboardPage;


    public static void initializePageObjects() {
            loginPage = new LoginPage();
            dashboardPage = new DashboardPage();
            addEmployeePage = new AddEmployeePage();
//          addEmpLicense = new AddLicensePage();
//         dependant = new DependantsPage();
//         emergencyContact = new EmergencyContactsPage();
//         empList = new EmployeeListPage();
//         job = new JobPage();
//         language = new LanguagesPage();
//         membership = new MembershipsPage();
//         empList = new EmployeeListPage();
//        qualification = new QualificationsPage();
//        skills = new SkillsPage();
          searchEmployeePage = new SearchEmployeePage();
         essUserDashboardPage = new ESSUserDashboardPage();


    }
}
