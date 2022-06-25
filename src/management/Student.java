package management;

public class Student {
    private int studentNum;
    private String birth;
    private int age;
    private String name;
    private String dept;

    public Student(int studentNum, String birth,int age, String name, String dept) {
        this.studentNum = studentNum;
        this.birth = birth;
        this.age = age;
        this.name = name;
        this.dept = dept;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptNum() {
        return dept;
    }

    public void setDeptNum(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "{" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
