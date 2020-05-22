package NewPackage;

public class RemoveSpecial {

	public static void main(String[] args) {
		String s = "#@$#@$#@$#@ Payal $#$#$ 1234567";
		s = s.replaceAll("[^a-zA-Z-0-9]", "");
		System.out.println(s);
	}

}
