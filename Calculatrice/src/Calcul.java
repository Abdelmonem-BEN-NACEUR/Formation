import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Calcul {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> Air = new ArrayList<String>();
		Air.add("l'air est nécesssaire à la vie de l'homme hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		Air.add("air is ok");
		Air.add("air dans la plume");
		
		ArrayList<String> Eau = new ArrayList<String>();
		Eau.add("l'eau potable");
		Eau.add("eau dans les vaisseaux");
		Eau.add("eau sanitaire de meme is ok");
		
		ArrayList<String> Terre = new ArrayList<String>();
		Terre.add("la Terre est ronde");
		Terre.add("Terre et lune");
		Terre.add("sauvez la Terre avant qu'il soit trop tard!");
		
		HashMap<String, ArrayList<String>> Hmap= new HashMap<String,ArrayList<String>>();
		Hmap.put("air", Air);
		Hmap.put("eau",Eau);
		Hmap.put("Terre",Terre);
		
		System.out.println(Hmap.get("eau"));
		
	}
}