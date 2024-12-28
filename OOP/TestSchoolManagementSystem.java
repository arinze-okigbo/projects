public class TestSchoolManagementSystem {
    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem(
            "students.csv", 
            "teachers.csv", 
            "courses.csv", 
            "departments.csv"
        );

        try {
            System.out.println("\n--- Department with Maximum Students ---");
            sms.departmentWithMaxStudents();

            System.out.println("\n--- Teacher Advising Minimum Students ---");
            sms.teacherWithMinStudents();

            System.out.println("\n--- Department Chairs ---");
            sms.departmentChairs();

            System.out.println("\n--- Students Missing Nationality ---");
            sms.studentsMissingNationality();

            System.out.println("\n--- Course Instructors ---");
            sms.courseInstructors();

        } catch (MissingDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
