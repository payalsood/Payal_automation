package NewPackage;

public class RemoveSpecial {

	public static void main(String[] args) {
		//remove special characters from string
		String s = "#@$#@$#@$#@ Payal $#$#$ 1234567";
		//s = s.replaceAll("[^a-zA-Z-0-9]", "");
		//System.out.println(s);
		
		//remove white space from string
		s=s.replaceAll("[\\s]", (""));
		System.out.println(s);
	}

}
