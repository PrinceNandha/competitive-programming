/*In Little Flowers Public School, there are many students with same first names. You are given a task to find the students with same names. You will be given a string comprising of all the names of students and you have to tell the name and count of those students having same. If all the names are unique, print -1 instead.
Note: We don't have to mention names whose frequency is 1.
Input Format:
The only line of input will have a string ‘str’ with space separated first names of students.
Output Format:
Print the names of students along with their count if they are repeating. If no name is repeating, print -1
Constraints:
1 <= |str| <= 10^5
Time Limit: 1 second
Sample Input 1:
Abhishek harshit Ayush harshit Ayush Iti Deepak Ayush Iti
Sample Output 1:
harshit 2
Ayush 3
Iti 2
Sample Input 2:
Abhishek Harshit Ayush Iti
Sample Output:
-1
*/

//Solution---------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /* Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String strw = sc.nextLine();
        int count=0;
        String[] s = strw.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String str: s){
            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                count++;
                int c = map.get(str);
                map.remove(str);
                map.put(str, c+1);
            }
        }
        if(count==0){
            System.out.println(-1);
            return;
        }
        Set<String> set = map.keySet();
        for(String s1 : set){
            if(map.get(s1)>1){
                System.out.println(s1 + " " + map.get(s1));
            }
        }

    }

}
