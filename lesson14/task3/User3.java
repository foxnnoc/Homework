package lesson14.task3;

public class User3 {
    private String login = "Artur";
    private String password = "115872";

    public void createQuery() {
        User3.Query q = new User3.Query();
        q.printToLog(this);
    }

    public static class Query {
        public void printToLog(User3 user) {
            System.out.println("User is " + user);
            System.out.println("login: " + user.login);
            System.out.println("password: " + user.password);
        }
    }
    public static void main(String[] args) {
        User3 user = new User3();
        user.createQuery();
        User3.Query query = new User3.Query();
        query.printToLog(user);
        new User3.Query().printToLog(user);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}