package com.project.ui;
import static com.project.MainDriver.scanner;

import com.project.model.Giraffe;
import com.project.service.GiraffeService;

public class GiraffeUi {
	
	private GiraffeService gs;
	
	{
		gs = new GiraffeService();
	}
	
	public void createGiraffe() {
		System.out.println("Lets create a giraffe");
		System.out.println("what is the name of your giraffe?");
		String name = scanner.next();
		System.out.println("youre awesome, but does this giraffe exist? enter yes or no");
		String answer = scanner.next();
		boolean exist = answer.equals("yes");
		Giraffe g = gs.insert(name, exist);
		System.out.println("here is your new giraffe: ");
		System.out.println(g);
	}
	
	public void menu() {
		System.out.println("please select an option:");
		System.out.println("----1 look at all the giraffes");
		System.out.println("----2 make a giraffe");
		System.out.println("----3 find a giraffe");
		System.out.println("----4 leave the giraffes");
		int chosen = scanner.nextInt();
		switch(chosen) {
		case 1:
			viewGiraffes();
			menu();
			break;
		case 2:
			createGiraffe();
			menu();
			break;
		case 3:
			findGiraffe();
			menu();
			break;
		case 4:
			System.exit(0);
		default:
			menu();
			break;
		}
		
	}
	
	public void viewGiraffes() {
		System.out.println(gs.getAllGiraffes());
	}
	
	public void findGiraffe() {
		System.out.println("how would you like to find a giraffe?");
		System.out.println("----1 by id");
		System.out.println("----2 by name");
		int chosen = scanner.nextInt();
		switch (chosen) {
		case 1:
			System.out.println(findById());
			menu();
			break;
		case 2:
			System.out.println(findByName());
			menu();
			break;
		default:	
			System.out.println("please choose an accurate option");
			findGiraffe();
			break;
		}
	}
	
	public Giraffe findById() {
		System.out.println("what is the id of the giraffe?");
		int chosen = scanner.nextInt();
		Giraffe g = gs.getbyId(chosen);
		return g;
	}
	
	public Giraffe findByName() {
		System.out.println("what is the name of the giraffe?");
		String chosen = scanner.next();
		Giraffe g = gs.getByName(chosen);
		return g;
	}

}
