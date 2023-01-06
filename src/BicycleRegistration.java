public class BicycleRegistration
{
	public static void main(String[] args) {
		Bicycle bike1,bike2;	
		String owner1,owner2;	
		String Tagnum1,Tagnum2;	
		Bicycle tagno1,tagno2;	

		bike1= new Bicycle();
		bike1.setOwnerName("Chazel");//Setting the OwnerName 
		bike2= new Bicycle();
		bike2.setOwnerName("Kyla");//Setting the OwnerName

		owner1=bike1.getOwnerName();//Getting the owner name
		owner2=bike2.getOwnerName();

		tagno1= new Bicycle();
		tagno1.setTagNo("2004-134R");
		tagno2= new Bicycle();
		tagno2.setTagNo("2005-456T");

		Tagnum1=tagno1.getTagNo();
		Tagnum2=tagno2.getTagNo();

		System.out.println("THIS IS THE OUPUT OF LAB EXERCISE 1.1\n");
		System.out.println("This is the ouput of the labexercise 1.1");
		System.out.println("\t"+owner1+" owns a Bicycle with a tag number: "+Tagnum1);
		System.out.println("\t"+owner2+" also owns a  Bicycle with a tag number: "+Tagnum2);
	}
}
