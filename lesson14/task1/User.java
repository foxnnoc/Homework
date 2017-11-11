package lesson14.task1;

public class User {
    private String login = "Artur";
    private String password = "115872";

    public void createQuery() {
        Query q = new Query();
        q.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.println("User is " + User.this);
            System.out.println("login: " + login);
            System.out.println("password: " + password);
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();
        User.Query query2 = new User().new Query();
        query2.printToLog();
    }

    @Override
    public String toString() {
        return "User{" + "login='" + login + '\'' + ", password='" + password + '\'' + '}';
    }
}