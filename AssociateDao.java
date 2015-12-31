import java.util.List;

public interface AssociateDao {
	public List<Associate> getAllAssociates();
	public Associate getAssociate(int id);
	public void updateAssociate(Associate associate);
	public void deleteAssociate(Associate assocaite);
}