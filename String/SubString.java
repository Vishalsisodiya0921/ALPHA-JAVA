package String;

public class SubString {
    public static String subString(String str,int si,int ei){
        String subStr = "";
        for(int i=si; i<ei ;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,8));
        //System.out.println(subString(str, 0, 5));
    }
}
