import java.util.ArrayList;
import java.util.List;

public class AssociateDaoImpl implements AssociateDao {
	
	List<Associate> associates;

	public AssociateDaoImpl(){
		associates = new ArrayList<Associates>();
		Associate ass1 = new Associate("Kelli", 321);
		Associate ass2 = new Associate("Krysal", 432);
		associates.add(ass1);
		associates.add(ass2);
	}

	public void deleteAssociate(Associate associate) {
		associates.remove(associate.getId());
		System.out.println("Associate ID: " + associate.getId() + " has been deleted, no coming back from this buddy.");
	}


	public List<Assciate> getAllAssociates() {
		return associates;
	}

	public Associate getAssociate(int id) {
		return associates.get(id);
	}

	public void updateAssociate(Associate associate){
		associates.get(associate.getId()).setName(associate.getName());
		System.out.println("Associate ID: " + associate.getId() + " has been updated, so long old name");
	}


}