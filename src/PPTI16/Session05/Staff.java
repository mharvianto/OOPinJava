package PPTI16.Session05;

public class Staff extends User {
    protected RoleStaff role = RoleStaff.Supervisor;
    // private int Role = 0;
    protected int salary;

    public Staff(String name, String password, String email, RoleStaff role) {
        super(name, password, email);
        this.role = role;
    }
}
