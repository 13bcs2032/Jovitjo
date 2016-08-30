
public class Pos_or_Neg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char ch=args[1];
//		if()
		int a=Integer.parseInt(args[0]);
		if(a>0){
			System.out.println("Positive");
		}
		else if(a<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Neither Positive nor Negative");
		}
	}

}
