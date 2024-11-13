public class Professor extends Person {
    private String department;

    public void teach() {
        System.out.println("Teaching in the " + department + " department.");
    }
}
