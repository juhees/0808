import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student [] array;
	private Scanner sc;
	private File file;
	
	//생성자가 위 세개의 멤버변수를 초기화 할거임
	public Input(Student[] array,String path) { 
		this.array = array;
		this.file = new File(path);
		
		try {
			this.sc = new Scanner(this.file,"utf-8");
			//System.out.println("file found");
		} catch (FileNotFoundException e) {
			System.out.println("file not found"); //파일을 못찾았을 경우
		}
	}

	public void fileInput() {
		for(int i=0; i<this.array.length; i++) {
			String line = this.sc.nextLine();//1101 한송이 78 87 83 78
			//String [] values = line.split("\\s+"); // 스페이스를 기준으로 잘라서 배열에 넣어주셈
			Scanner myScanner = new Scanner(line);
			myScanner=myScanner.useDelimiter("\\s+");
			this.array[i] = new Student(myScanner.next(), myScanner.next(),
					myScanner.nextInt(),myScanner.nextInt(),myScanner.nextInt(),myScanner.nextInt());
		}
		
	}
	
	
	

}
