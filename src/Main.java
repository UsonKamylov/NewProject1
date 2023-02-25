import company.model.Gender;
import company.model.MyException;
import company.model.User;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Bakyt", 22, Gender.MALE);
        User user2 = new User(2, "Aibek", 18, Gender.MALE);
        User user3 = new User(3, "Asan", 23, Gender.MALE);
        User user4 = new User(4, "Uson", 24, Gender.MALE);
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        userService.addUser(user4);
        //userService.getAllUsers();
        try {
            userService.deleteById(3);
        }catch (MyException r){
            System.out.println(r.getMessage());
        }
//        System.out.println("------------------------------------------------");
//        try {
//            System.out.println(userService.findById(5));
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
    }
}