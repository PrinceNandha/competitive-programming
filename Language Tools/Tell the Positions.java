// In a class there are ‘n’ number of students. They have three different subjects: Data Structures, Algorithm Design & Analysis and Operating Systems. Marks for each subject of all the students are provided to you. You have to tell the position of each student in the class. Print the names of each student according to their position in class. Tie is broken on the basis of their roll numbers. Between two students having same marks, the one with less roll number will have higher rank. The input is provided in order of roll number.
// Input Format:
// First line will have a single integer ‘n’, denoting the number of students in the class.
// Next ‘n’ lines each will have one string denoting the name of student and three space separated integers m1, m2, m3 denoting the marks in three subjects.
// Output Format:
// Print ‘n’ lines having two values: First, the position of student in the class and second his name.
// Constraints:
// 1 <= n <= 10^5
// 0 <= m1, m2, m3 <= 100
// Sample Input:
// 3
// Mohit 94 85 97
// Shubham 93 91 94
// Rishabh 95 81 99
// Sample Output:
// 1 Shubham
// 2 Mohit
// 3 Rishabh

//Solution-----------------------------------------------------------------
import java.util.*;

public class Main {
	static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            student[i].name = sc.next();
            student[i].m1 = sc.nextInt();
            student[i].m2 = sc.nextInt();
            student[i].m3 = sc.nextInt();
            student[i].rollNo = i + 1;
        }
        for (int i = 0; i < n; i++) {
            student[i].total = student[i].m1 + student[i].m2 + student[i].m3;
        }

        Arrays.sort(student,new compareStudents());
        for (int i = 0; i < n; i++) {
            student[i].rank = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(student[i].rank + " " + student[i].name);
        }
    }
    static class Student {

        String name;
        int m1;
        int m2;
        int m3;
        int total;
        int rollNo;
        int rank;
    }

    static class compareStudents implements Comparator<Student> {

        public int compare(Student a, Student b) {
            if(a.total!=b.total){
                return b.total-a.total;
            }
            return a.rollNo-b.rollNo;
        }
    }
}
