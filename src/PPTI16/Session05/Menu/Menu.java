package PPTI16.Session05.Menu;

import PPTI16.Session05.RoleStaff;
import PPTI16.Session05.Staff;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        Staff ani = new Staff("Ani", "Ani123", "ani@gmail.com", RoleStaff.Outsource);
        ani.login("ani@gmail.com", "ani123");
    }
}
