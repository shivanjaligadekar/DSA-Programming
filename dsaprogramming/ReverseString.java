package dsaprogramming;

public class ReverseString {

	public static void main(String[] args) {
		
//	   String str="Shivanjali";
//	   String reversedStr=" ";
//	   
//	   for(int i=str.length()-1;i>=0;i--) {
//		   reversedStr=reversedStr+str.charAt(i);
//		   System.out.println(reversedStr);
//	   }
		
        
//        public static String reverseString(String s) {
//            char[] charArray = s.toCharArray();
//            int left = 0, right = charArray.length - 1;
//
//            while (left < right) {
//                char temp = charArray[left];
//                charArray[left++] = charArray[right];
//                charArray[right--] = temp;
//            }
//
//            return new String(charArray);
//        
//	}
		

		String originalString = "hello";
        String reversedString = reverseString(originalString);
        
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
	}
	public static String reverseString(String s) {
        String reversed = "";
        int length = s.length();
        int index = length - 1;

        while (index >= 0) {
            if (index >= 0) {
                reversed += s.charAt(index);
                index--;
            }
        }

        return reversed;
    }

}
