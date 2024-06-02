class pri{
    private int rollno;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
public class demo3 {
    public static void main(String[] args) {
        pri e = new pri();
        e.setRollno(23);
        System.out.println(e.getRollno());
    }
}
