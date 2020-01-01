
public class DGP {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		System.out.println(a.length());
		int c = 0;
		String[] words = a.split(" ");
		System.out.println(Arrays.toString(words));
	//	System.out.println(words.length);
		String ns = words[0];
		for(int i=1; i<words.length;i++){
			String s = words[i];	
			if(!s.isEmpty()){
				ns = ns+s;
				c++;
			}
		}
		System.out.print(c+1);
		System.out.print(" "+ns);
		System.out.print(" "+ns.length());
		System.out.print(" "+(a.length()-ns.length()));
		System.out.printf("\n%d..........123.........%d",a.length(),c);
		/*
		 * A dummy line
		 * System.out.println("You are in Git");
		 * 
		 */
		System.out.println("Creating first tag");
		System.out.println("Second tag");
		input.close();
	}
}

