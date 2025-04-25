package ArraysAndStrings;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Was it a car or a cat I saw?";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		if(s.length() == 0) {
			return false;
		}
        String rs = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(rs);
        boolean flag=true;
        int n = rs.length()-1;
        int i=0;
        while(i<n){
            if(rs.charAt(i) == rs.charAt(n)){
                i++;
                n--;
            } else {
                flag=false;
                break;
            }
        }
        return flag;
    }

}
