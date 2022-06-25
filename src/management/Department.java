package management;

import java.util.ArrayList;
import java.util.Arrays;

public class Department {
    private int deptNum;
    private String name;
    ArrayList<Student> students;

    public Department() {
        setStudents();
    }

    public Department(int deptNum, String name) {
        this.deptNum = deptNum;
        this.name = name;
        setStudents();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }


    public int getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(int deptNum) {
        this.deptNum = deptNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(){
        ArrayList<Student> studentsArr = new ArrayList<>();
        students = studentsArr;
    }

    public String showAllStudent(){
        String stuAll = Arrays.deepToString(this.students.toArray());
        return stuAll;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNum=" + deptNum +
                ", name='" + name + '\'' +
                ", students=" + showAllStudent() +
                '}';
    }

}
