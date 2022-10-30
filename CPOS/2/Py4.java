
class Py4{

	public static void main (String [] args) {
	
	for (int i=1 ; i<=9 ; i++){
		int p=1;
		for (int j=i; j<=9; j++){
			System.out.print("  ");
		}
		for (int j=1; j<i; j++){
			System.out.print(p++ +" ");
		}
		
		for (int j=1; j<=i; j++){
			System.out.print(p-- +" ");
		}
		System.out.println();
	}

	}
	
}