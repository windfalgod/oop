package nguyenxuannghia_20001954.lab6.part2.ex1;

public class TestLineSub {

    public static void main(String[] args) {
        LineSub line = new LineSub(0, 0, 3, 4);
        System.out.println(line);
        System.out.println("Line's length: " + line.getLength());
        System.out.println("Line's gradient: " + line.getGradient());
    }
}
