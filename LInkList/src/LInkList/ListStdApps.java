package LInkList;

public class ListStdApps {
	public static void main(String []args) {
		Linklist example = new Linklist();
		example.insertFirst("4410","Elsword","Equipment System","B");
		example.insertFirst("4411","Aisha","Equipment System","C");
		example.insertFirst("4412","Sieghart","Equipment System","A");
		example.insertFirst("4413","Elesis","Equipment System","D+");
		example.displayList();
		SubjectLink hi = example.find("4410");
		if(hi != null)
	  System.out.println("Found link with ID " + hi.ID);
		else
			System.out.println("Finding Link it's not found");
		
		
		SubjectLink tiamat = example.delete("4413");
	if(tiamat != null)
			System.out.println(tiamat.ID + " is Deleted :");
		
		else
			System.out.println("The  deleted list isn't match with the other");
		System.out.println("------------------------------------------------");
		example.displayList();
		SubjectLink Rose = example.insertFirst("4414","Rose","Equipment System","B+");
		if(Rose != null)
			System.out.println(Rose.name +" is new student");
		else
			System.out.println("New Student isn't found");
		example.displayList();
		
	}

}