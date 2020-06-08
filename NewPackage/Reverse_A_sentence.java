package NewPackage;

public class Reverse_A_sentence {

	public static void main(String[] args) {
		String s = "Java is a very good language";
		
		String[] s1 = s.split("\\s");
		
		String ans = "";
		
		for(int i =s1.length-1; i>=0;i--){
			ans = ans + s1[i] + " ";
		}
		
		System.out.println(ans);

	}

}
