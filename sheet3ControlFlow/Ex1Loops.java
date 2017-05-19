package sheet3ControlFlow;

public class Ex1Loops {

	public static void main(String[] args) {

		int i = 0;

		while(i < 23){
			if(i != 22){
				System.out.println(i + ",");
			}else
				System.out.println(i);
			i++;		
		}
		i = 0;
		do{
			System.out.println(i + ",");
			i++;
		}while(i < 22);
		System.out.println(i);

		for(i = 0;i < 22;i++){
			System.out.println(i + ",");
		}
		System.out.println(i);

	}

}


