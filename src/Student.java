import java.time.LocalDate;
import java.util.Objects;

public class Student extends Person {

    private String university;
    private String faculty;
    private String academicDepartment;
    private String academicGroup;
    private String speciality;
    private String specialtyCode;
    private String fieldOfKnowledge;
    private String fieldOfKnowledgeCode;
    private String studentTicketNumber;
    private LocalDate admissionDate;
    private int studyPeriod;
    private int totalNumberOfDisciplines;
    private double averageMark;
    private int numberOfAcademicDebts;
    private int numberOfScientificPublications;
    private String educationalLevel;
    private String formOfEducation;
    private int scholarshipAmount;
    private int course;
    private boolean isStudentOfMilitaryDepartment;

    public Student() {
    }

    public Student(String firstName, String lastName, String patronymic, String address,
                   LocalDate dateOfBirth, String university, String faculty,
                   String academicDepartment, String academicGroup, String speciality,
                   String specialtyCode, String fieldOfKnowledge, String fieldOfKnowledgeCode,
                   String studentTicketNumber, LocalDate admissionDate, int studyPeriod,
                   int totalNumberOfDisciplines, double averageMark, int numberOfAcademicDebts,
                   int numberOfScientificPublications, String educationalLevel, String formOfEducation,
                   int scholarshipAmount, int course, boolean isStudentOfMilitaryDepartment) {
        super(firstName, lastName, patronymic, address, dateOfBirth);
        this.university = university;
        this.faculty = faculty;
        this.academicDepartment = academicDepartment;
        this.academicGroup = academicGroup;
        this.speciality = speciality;
        this.specialtyCode = specialtyCode;
        this.fieldOfKnowledge = fieldOfKnowledge;
        this.fieldOfKnowledgeCode = fieldOfKnowledgeCode;
        this.studentTicketNumber = studentTicketNumber;
        this.admissionDate = admissionDate;
        this.studyPeriod = studyPeriod;
        this.totalNumberOfDisciplines = totalNumberOfDisciplines;
        this.averageMark = averageMark;
        this.numberOfAcademicDebts = numberOfAcademicDebts;
        this.numberOfScientificPublications = numberOfScientificPublications;
        this.educationalLevel = educationalLevel;
        this.formOfEducation = formOfEducation;
        this.scholarshipAmount = scholarshipAmount;
        this.course = course;
        this.isStudentOfMilitaryDepartment = isStudentOfMilitaryDepartment;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAcademicDepartment() {
        return academicDepartment;
    }

    public void setAcademicDepartment(String academicDepartment) {
        this.academicDepartment = academicDepartment;
    }

    public String getAcademicGroup() {
        return academicGroup;
    }

    public void setAcademicGroup(String academicGroup) {
        this.academicGroup = academicGroup;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpecialtyCode() {
        return specialtyCode;
    }

    public void setSpecialtyCode(String specialtyCode) {
        this.specialtyCode = specialtyCode;
    }

    public String getFieldOfKnowledge() {
        return fieldOfKnowledge;
    }

    public void setFieldOfKnowledge(String fieldOfKnowledge) {
        this.fieldOfKnowledge = fieldOfKnowledge;
    }

    public String getFieldOfKnowledgeCode() {
        return fieldOfKnowledgeCode;
    }

    public void setFieldOfKnowledgeCode(String fieldOfKnowledgeCode) {
        this.fieldOfKnowledgeCode = fieldOfKnowledgeCode;
    }

    public String getStudentTicketNumber() {
        return studentTicketNumber;
    }

    public void setStudentTicketNumber(String studentTicketNumber) {
        this.studentTicketNumber = studentTicketNumber;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getStudyPeriod() {
        return studyPeriod;
    }

    public void setStudyPeriod(int studyPeriod) {
        this.studyPeriod = studyPeriod;
    }

    public int getTotalNumberOfDisciplines() {
        return totalNumberOfDisciplines;
    }

    public void setTotalNumberOfDisciplines(int totalNumberOfDisciplines) {
        this.totalNumberOfDisciplines = totalNumberOfDisciplines;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getNumberOfAcademicDebts() {
        return numberOfAcademicDebts;
    }

    public void setNumberOfAcademicDebts(int numberOfAcademicDebts) {
        this.numberOfAcademicDebts = numberOfAcademicDebts;
    }

    public int getNumberOfScientificPublications() {
        return numberOfScientificPublications;
    }

    public void setNumberOfScientificPublications(int numberOfScientificPublications) {
        this.numberOfScientificPublications = numberOfScientificPublications;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public String getFormOfEducation() {
        return formOfEducation;
    }

    public void setFormOfEducation(String formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setScholarshipAmount(int scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isStudentOfMilitaryDepartment() {
        return isStudentOfMilitaryDepartment;
    }

    public void setStudentOfMilitaryDepartment(boolean studentOfMilitaryDepartment) {
        isStudentOfMilitaryDepartment = studentOfMilitaryDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studyPeriod == student.studyPeriod && totalNumberOfDisciplines == student.totalNumberOfDisciplines
                && Double.compare(student.averageMark, averageMark) == 0
                && numberOfAcademicDebts == student.numberOfAcademicDebts
                && numberOfScientificPublications == student.numberOfScientificPublications
                && scholarshipAmount == student.scholarshipAmount && course == student.course
                && isStudentOfMilitaryDepartment == student.isStudentOfMilitaryDepartment
                && Objects.equals(university, student.university) && Objects.equals(faculty, student.faculty)
                && Objects.equals(academicDepartment, student.academicDepartment)
                && Objects.equals(academicGroup, student.academicGroup)
                && Objects.equals(speciality, student.speciality)
                && Objects.equals(specialtyCode, student.specialtyCode)
                && Objects.equals(fieldOfKnowledge, student.fieldOfKnowledge)
                && Objects.equals(fieldOfKnowledgeCode, student.fieldOfKnowledgeCode)
                && Objects.equals(studentTicketNumber, student.studentTicketNumber)
                && Objects.equals(admissionDate, student.admissionDate)
                && Objects.equals(educationalLevel, student.educationalLevel)
                && Objects.equals(formOfEducation, student.formOfEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(university, faculty, academicDepartment, academicGroup, speciality, specialtyCode,
                fieldOfKnowledge, fieldOfKnowledgeCode, studentTicketNumber, admissionDate, studyPeriod,
                totalNumberOfDisciplines, averageMark, numberOfAcademicDebts, numberOfScientificPublications,
                educationalLevel, formOfEducation, scholarshipAmount, course, isStudentOfMilitaryDepartment);
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", academicDepartment='" + academicDepartment + '\'' +
                ", academicGroup='" + academicGroup + '\'' +
                ", speciality='" + speciality + '\'' +
                ", specialtyCode='" + specialtyCode + '\'' +
                ", fieldOfKnowledge='" + fieldOfKnowledge + '\'' +
                ", fieldOfKnowledgeCode='" + fieldOfKnowledgeCode + '\'' +
                ", studentTicketNumber='" + studentTicketNumber + '\'' +
                ", admissionDate=" + admissionDate +
                ", studyPeriod=" + studyPeriod +
                ", totalNumberOfDisciplines=" + totalNumberOfDisciplines +
                ", averageMark=" + averageMark +
                ", numberOfAcademicDebts=" + numberOfAcademicDebts +
                ", numberOfScientificPublications=" + numberOfScientificPublications +
                ", educationalLevel='" + educationalLevel + '\'' +
                ", formOfEducation='" + formOfEducation + '\'' +
                ", scholarshipAmount=" + scholarshipAmount +
                ", course=" + course +
                ", isStudentOfMilitaryDepartment=" + isStudentOfMilitaryDepartment +
                '}';
    }

}
