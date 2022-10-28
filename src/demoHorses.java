
public class demoHorses {
	public static void main(String[] args) {
		horse horse1 = new horse();
		raceHorse horse2 = new raceHorse();
		
		horse1.setName("Jeff");
		horse1.setColor("Pink");
		horse1.setBirthYear("2030");
		horse2.setName("Sydney");
		horse2.setColor("Purple");
		horse2.setBirthYear("2031");
		horse2.setRaces(3);
		
		System.out.println(horse1.getName()+", "+horse1.getColor()+", "+horse1.getBirthYear());
		System.out.println(horse2.getName()+", "+horse2.getColor()+", "+horse2.getBirthYear()+", "+horse2.getRaces());
		
	}
}
