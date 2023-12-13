package big;

public class Student implements Comparable<Student> {
    /*
    id the variable stores the student id and declare it as private (type: int)
    latestId the variable stores the latest id used by the Student object and declares it as private and static (type: int)
    firstName the variable stores the first name of the student and declare it as private (type: String)
    lastName the variable stores the last name of the student and declare it as private (type: String)
*/
    private int id;
    private static int latestid;
    private String firstName;
    private String lastName;

    /*
    set id as latestId
    increment latestId by 1
    receive the firstName and lastName, then assign them to the instance variables
     */
    public Student(String firstName, String lastName){
        this.id = latestid++;
        this.firstName = firstName;
        this.lastName = lastName;

    }
/*
1.Getters of variables: id, name, students, and size
2.Setter of variable: name
 */
    public int getId() {
        return id;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student std) {
        return this.id = std.id;
    }
}
