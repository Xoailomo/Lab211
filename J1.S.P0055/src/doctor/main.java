package doctor;

public class main {
  private static control co;
    public static void main(String[] args) throws Exception {
        co = new control();
        view.menu();
        int choice;
        do {
            choice = validate.getInt("Enter choice: ","[1-5]{1}");
            switch (choice) {
                case 1:
                    co.add();
                    break;
                case 2:
                    co.Update();
                    break;
                case 3:
                    co.Delete();
                    break;
                case 4:
                    co.search();
                    break;
                default:
                    break;
            }
        }while(choice !=5);
    
    }
}
