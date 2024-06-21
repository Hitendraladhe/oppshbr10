import java.util.HashMap;

class AddreessBook{
    private HashMap<String, String[]>address_book1;
    AddreessBook(){
        address_book1 = new HashMap<>();
    }

    public void addContact(String fname, String lname, String address, String mob_num, String email){
        String[] contactInfo = {address, mob_num, email};
        String key = fname+lname;
        address_book1.put(key, contactInfo);
        System.out.println("Contact is Added " + key);
    }
    public void editContact(String fname, String lname,  String address, String mob_num, String email){
        String[] contactInfo = address_book1.get(fname+ lname);
        contactInfo[0] = address;
        contactInfo[1] = mob_num;
        contactInfo[2] = email;
        System.out.println(fname+ lname+" address "+contactInfo[0]+" mobile number "+contactInfo[1]+" email "+contactInfo[2]);
    }
    public void delete(String fname, String lname){
        address_book1.remove(fname+lname);
        display();
    }
    public void display(){
        System.out.println("the address book... ");
        System.out.println(address_book1.keySet());
        for (String key : address_book1.keySet()){
            String[] contaInfo = address_book1.get(key);
            String add = contaInfo[0];
            String mob = contaInfo[1];
            String mail = contaInfo[2];

            System.out.println(key+" address "+contaInfo[0]+" mobile number "+contaInfo[1]+" email "+contaInfo[2]);
        }
    }
}


public class AdreessBookProgram {
    public static void main(String[] args) {
        AddreessBook obj1 = new AddreessBook();
        obj1.addContact("hitu", "ladhe", "govandi", "92829229292", "ht@gmail.com");
        obj1.addContact("nikhil", "narkhede", "ind", "86767676722", "nikhil@gmail.com");
        obj1.addContact("kia", "lee", "japan", "2333222ii22", "lee@gmail.com");
        obj1.editContact("hitu", "ladhe", "thane", "8757575757", "sde@gmail.com");
        obj1.delete("hitu", "ladhe");
        obj1.display();
    }
}
