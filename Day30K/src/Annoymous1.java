public class Annoymous1 {
	  public String sayHello(Animal animal, String sound) {
	        return animal.cry(sound);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annoymous1 animalFarm = new Annoymous1();

	        Animal tiger = (sound) -> "Hi, Tiger " + sound;
	        System.out.println(animalFarm.sayHello(tiger, "ROARR"));	
	}
	 

}
interface Animal {
    public String cry(String sound);
}
