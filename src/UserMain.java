public class UserMain {
    static int num = 1;
    public static void main(String[] args) {
        User user1 = new User("vihsal","vishal@gmail.com",466156156l);
        final int number = 10;
        System.out.println(number);
        System.out.println("vishal  "+user1.humans);

        User user2 = new User("yeshwant","vishal@gmail.com",466156156l);
        user2.humans = "animals";
        System.out.println("yeshwant  "+user2.humans);
        User user3 = new User("akhil","vishal@gmail.com",466156156l);
        System.out.println("akhil "+ user3.humans);
        System.out.println(num);
        nonStaticMethod();
        User[] users = new User[3];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
    }
    public static void nonStaticMethod(){
        System.out.println(num);
    }
}
