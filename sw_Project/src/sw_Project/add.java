package sw_Project;

public class add {
	//생성자 
	//get set
	int [] arr;
	String op;
	int result;
	
	add(int arr_size, String op){
		arr = new int[arr_size];
		this.op = op;
	}
	
	//getter setter
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	int Calc() {
		result = 0;
		switch (op) {
		case "+":
			
			break;

		default:
			break;
		}
		
	}
	
	

}
