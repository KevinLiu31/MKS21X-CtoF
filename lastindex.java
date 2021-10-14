public class lastindex{
  public static int lastIndex(String str, String sub){
    int subLength = sub.length();
    for(int i = str.length(); i >=  sub.length(); i--){
      if((str.substring(i - sub.length(), i)).equals(sub)){
        return i;
      }
    }
    return (-1);
  }
  public static void main(String[]args){
    System.out.println(lastIndex("woered","ed"));
    System.out.println(lastIndex("lasvfbgikudfbsgdsfbog","kud"));
      System.out.println(lastIndex("lasvfbgikudfbsgdsfbog","camera"));
      System.out.println(myUpper("HeLlo"));
      System.out.println(myUpper("HeL lo"));
  }
  public static String myUpper(String str){
    String ans = "";
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) >= 97){
        ans = ans + (char)(str.charAt(i) - 32);
      }
      else{
        ans = ans + str.charAt(i);
      }
    }
    return ans;
  }
}
