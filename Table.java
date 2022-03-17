package Day4;
//wap to display table of a number
public class Table {

	public static void main(String[] args) {
		
		int n=5;
		//without loop 
		System.out.println(n*1);
		System.out.println(n*2);
		System.out.println(n*3);
		System.out.println(n*4);
		System.out.println(n*5);
		System.out.println(n*6);
		System.out.println(n*7);
		System.out.println(n*8);
		System.out.println(n*9);
		System.out.println(n*10);
		
		
		// with loop
		for(int i=1; i<=10;i++)
					System.out.println(n*i);

	}

}
