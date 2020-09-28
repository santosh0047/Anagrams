import java.util.*;
class anagrams {
    public static void main(String args[] ) throws Exception {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  while(n--!=0){
    String s=sc.next();
  String s1=sc.next();
  int a=0;
  int b=0;
  List<Character> ss=new LinkedList<>();
  for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      ss.add(ch);
      a++;
  }
  List<Character> ss1=new LinkedList<>();
  for(int i=0;i<s1.length();i++){
      char ch=s1.charAt(i);
      ss1.add(ch);
      b++;
  }
  int result=0;
  for(int i=0;i<ss.size();i++){
      for(int j=0;j<ss1.size();j++){
          char ch=ss.get(i);
          char ch1=ss1.get(j);
          if(ch==ch1){ss1.remove(j);result+=2;break;}
      }
  }

  System.out.println(a+b-result);
  }
    }
}