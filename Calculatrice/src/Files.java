import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
	static Scanner read=new Scanner(System.in);
public static void main(String[] args) {
	
FileWriter f;
try {
	f = new FileWriter("test.txt");
	f.write("Hello i'm abdelmonem");
	f.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	FileReader f2=new FileReader("test.txt");
	int c;
	while((c=f2.read())!=-1) {
		System.out.print((char) c);
		System.out.println("\n");
		System.out.print(f2.read());
		f2.close();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
}
