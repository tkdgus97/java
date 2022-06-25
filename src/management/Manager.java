package management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    ArrayList<Department> deptList;

    public Manager(){
        setDeptList();
    }

    public void runManger(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=========학사 관리 시스템=========");
        while (true){
            System.out.println("1.학생 정보 입력  2.학과 생성  3.전체 학과 출력  4.학과별 학생 출력  5.시스템 종료");
            int select = scan.nextInt();

            if (select == 1){
                createStudent();
            } else if (select == 2){
                addDept();
            }else if (select == 3){
                showDeptList();
            } else if (select == 4){
                showDeptInStudent();
            }else if (select == 5){
                break;
            }
        }
    }

    public void addDept(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("학과 번호 : ");
        int deptNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("이름 : ");
        String name = scanner.nextLine();

        Department dept = new Department(deptNum, name);
        this.deptList.add(dept);
    }

    public void createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("학번 : ");
        int studentNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("이름 : ");
        String name = scanner.nextLine();

        System.out.println("생년월일 : ");
        String birth = scanner.nextLine();

        System.out.println("나이 : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("학과 : ");
        String dept = scanner.nextLine();

        Student student = new Student(studentNum, birth, age, name, dept);
        for (Department department: deptList) {
            if (department.getName().equals(dept)){
                department.addStudent(student);
            }
        }
    }

    public void showDeptList(){
//        StringBuilder deptall = new StringBuilder();
//        for (Department dept: this.deptList) {
//            deptall.append(dept.toString());
//        }
        String deptList = Arrays.deepToString(this.deptList.toArray());
        System.out.println(deptList);
    }

    public void setDeptList(){
        ArrayList<Department> departmentArrayList = new ArrayList<>();
        deptList = departmentArrayList;
    }

    public void showDeptInStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("학과 입력 : ");
        String dept = scanner.nextLine();

        for (Department department: this.deptList) {
            if (department.getName().equals(dept)){
                String students = department.showAllStudent();
                System.out.println(students);
            }
        }
    }
}
