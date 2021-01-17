// Ayush loves the characters ‘a’, ‘s’, and ‘p’. He got a string of lowercase letters and he wants to find out how many times characters ‘a’, ‘s’, and ‘p’ occurs in the string respectively. Help him find it out.
// Input:
// First line contains an integer denoting length of the string.
// Next line contains the string.
// Constraints:
// 1<=n<=10^5
// ‘a’<= each character of string <= ‘z’
// Output:
// Three space separated integers denoting the occurrence of letters ‘a’, ‘s’ and ‘p’ respectively.
// Sample Input:
// 6
// aabsas
// Sample output:
// 3 2 0

//Solution-----------------------------------
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String str= sc.next();
        int countC=0, countS=0, countP=0;
        for(char c : str.toCharArray()){
            if(c == 'a'){
                countC++;
            }
            if(c == 's'){
                countS++;
            }
            if(c=='p'){
                countP++;
            }
        }
        System.out.print(countC+" "+ countS+" "+ countP);
	}
}