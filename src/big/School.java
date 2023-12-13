package big;

import java.util.Arrays;
import java.util.StringJoiner;

public class School {
    /*
    id the variable stores the school id and declare it as private (type: int)
    latestId the variable stores the latest id used by the School object and declares it as public and static (type: int)
    name the variable stores the school name and declare it as private (type: String)
    students the variable stores the student studying in the school and declare it as private (type: Student[])
    size the variable stores the amount of student that the school can handle and declare it as private (type: int)
     */
    private int id;
    private static int latestId;
    private String name;
    private Student[] students;
    private int size;

    /*
    The constructor should do these following task:
    set id as latestId
    increment latestId by 1
    receive the name and size, then assign it to the instance variable
    init the students array
     */

    public School(String name, int size) {
        this.id = latestId++;
        this.name = name;
        this.size = size;
        this.students = new Student[size];
    }

    /*
    Getters of variables: id, name, students, and size
    Setter of variable: name
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    addStudent(newStudent:Student):boolean if the amount of students is more than or equal to the size,
    meaning the school can't accept more students,
    you should return false, otherwise, add a new student to the students's array and return true
     */
    public boolean addStudent(Student newStudent){
        int count = 0;
        for(int i = 0 ; i<size;i++){
            if(students[i] != null) count++;
            if(count == size){
                return false;
            }
        }
        for(int i = 0;i<size;i++){
            if(students[i] == null){
                students[i] = newStudent; return true;
            }
        }
        return false;
    }
    /*
    removeStudent(id:int):boolean kick the student with the same student id
    you have received out of the school by removing a student from the students's array
     */
    public boolean removeStudent(int id){
        int count = 0;
        for(int i = 0; i < size;i++) {
            if (students[i] != null) count++;
        }
        for(int i = 0;i<size;i++){
            if(students[i].getId() == id){
                students[i]=students[count-1];
                students[count-1] = null;
                return true;
            }
            }
        return false;
    }
    /*
    getAllStudent():Student[] return all student in the school
     */
    public Student[] getAllStudent(){
        return students;

    }
    /*
    resize(newSize:int):boolean if the new size you have received is smaller or equal to the current student's array size,
    you should return false, or else expand the size of the student's array and return true
     */
    public boolean resize(int newSize){
        if(newSize <= students.length){ return false;}
        Student[] newStudents = new Student[newSize];
        System.arraycopy(students,0,newStudents,0,students.length);
        students = Arrays.copyOf(newStudents,newSize);
        return true;
    }
    /*
    toString():String
     */
    public String all(){
        StringJoiner str = new StringJoiner(",");

        for(int i = 0;i <size ;i++){
            if(students[i]!= null) {

                str.add(students[i].toString());
            }
        }
        return str.toString();
    }



}
