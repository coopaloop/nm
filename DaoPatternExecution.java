public class DaoPatternExecution {
   public static void main(String[] args) {
      AssociateDao AssociateDao = new AssociateDaoImpl();

      //print all associates
      for (Associate associate : associateDao.getAllassociates()) {
         System.out.println("associate: [RollNo : " + associate.getRollNo() + ", Name : " + associate.getName() + " ]");
      }


      //update associate
      associate associate =associateDao.getAllassociates().get(0);
      associate.setName("LaQwanda");
      associateDao.updateassociate(associate);

      //get the associate
      associateDao.getassociate(0);
      System.out.println("associate: [RollNo : " + associate.getRollNo() + ", Name : " + associate.getName() + " ]");		
   }
}