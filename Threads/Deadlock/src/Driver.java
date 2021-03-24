
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		//String notebook = "shared notebook";
		//String pencil = "shared pencil";
		
		notebook n = new notebook("shared notebook");
		pencil p = new pencil("shared pencil");
		
		// female students
		for (int i = 0; i<10; i++)
		new female_internal(n, p);
		
		// male students
		//for (int i = 0; i<10; i++)
		//new male_student(notebook, pencil);


	}

}
