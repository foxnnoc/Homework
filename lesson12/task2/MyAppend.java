package lesson12.task2;

public class MyAppend {

    public static void main(String args[]) {
        int a = 3;
        int b = 56;
        StringBuilder sb = new StringBuilder(100);
        sb.append(a).append(" + ").append(b).append(" = 59").append("\n").toString();
        sb.append(a).append(" - ").append(b).append(" = -53").append("\n").toString();
        sb.append(a).append(" * ").append(b).append(" = 168").append("\n").toString();
        System.out.println(sb);
        sb.insert(7, " равно ");
        sb.deleteCharAt(14);
        sb.insert(26, " равно ");
        sb.deleteCharAt(25);
        sb.insert(46, " равно ");
        sb.deleteCharAt(44);
        System.out.println(sb);
        sb.replace(8, 13, "равно");
        System.out.println(sb);
    }
}