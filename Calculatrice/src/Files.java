import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Files {
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException {
		
		  Employee emp = new Employee(); emp.name = "hussain roubaye"; emp.age = 26;
		  emp.dep = "software engeneer"; FileOutputStream fileout = null; try { fileout
		  = new FileOutputStream("employee.txt");
		  
		  ObjectOutputStream out;
		  
		  out = new ObjectOutputStream(fileout); out.writeObject(emp); out.close();
		  fileout.close();
		  System.out.println("Serialized data is saved in ./employee.txt file"); }
		  catch (IOException e) { // TODO Auto-generated catch block
		  e.printStackTrace();
		  
		  }
		 
		Employee emp1 = null;
		FileInputStream filein = null;
		try {
			filein = new FileInputStream("employee.txt");

			ObjectInputStream in;

			in = new ObjectInputStream(filein);
			emp1 = (Employee) in.readObject();
			in.close();
			filein.close();
			System.out.println(emp1.name + "\n" + emp1.age + " \n"+emp1.dep);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
