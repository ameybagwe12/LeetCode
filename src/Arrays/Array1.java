package Arrays;

import java.util.Arrays;
class Array1 {
    public static boolean checkIfPangram(String sentence) {
        int flag=0;
        for(int i=0 ;i< sentence.length();i++) {
            for(int j=i+1; j<sentence.length(); j++){
                if(sentence.charAt(i) == sentence.charAt(j)){
                    flag = 1;
                    break;
                }
                else flag=0;
            }
        }
        if(flag == 1){
            return false;
        }
        else return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }
}