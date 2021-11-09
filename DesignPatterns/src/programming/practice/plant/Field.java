package programming.practice.plant;

public class Field {
	public Plant orderPlant(String plantName) {
		Plant plant = PlantFactory.createPlant(plantName);
		
		if(plant == null) {
			return null;
		}
		
		plant.display();
		plant.creation();
		
		return plant;
	}
}
