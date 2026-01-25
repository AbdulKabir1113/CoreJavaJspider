package has_A;
import java.util.Scanner;

public class DriverBag {

    public static void main(String[] args) {

        Book b = new Book("Java", "James", 1000);
        Book b1 = new Book("Python", "Guido", 1000);

        Pen p = new Pen("Cello", "Black", 20);
        Pen p1 = new Pen("Pentonic", "Red", 30);
        Pen p2 = new Pen("Meow", "Blue", 10);

        LapTop l = new LapTop("HP", "Gray", 55000);
        Charger c = new Charger("HP", 65);
        LapTopBag lb = new LapTopBag("HP", "Black", 1300, l, c);

        Bag bg = new Bag("SkyBag", "Black", 1000, b, b1, p, p1, p2, lb);

        Scanner sc = new Scanner(System.in);
        boolean mainMenu = true;

        // ================= MAIN MENU =================
        while (mainMenu) {
            System.out.println("\n1) Bag Details\n2) Open Bag\n3) Exit");
            int ch = sc.nextInt();

            switch (ch) {

                case 1 -> {
                    System.out.println("Bag Brand : " + bg.brand);
                    System.out.println("Bag Color : " + bg.color);
                    System.out.println("Bag Price : " + bg.price);
                }

                case 2 -> {
                    boolean insideBag = true;

                    // ============ INSIDE BAG ============
                    while (insideBag) {
                        System.out.println("\n1) Book\n2) Pen\n3) LaptopBag\n4) Exit");
                        int in = sc.nextInt();

                        switch (in) {

                            // ---------------- BOOK ----------------
                            case 1 -> {
                                boolean bookMenu = true;
                                while (bookMenu) {
                                    System.out.println("\n1) Book1\n2) Book2\n3) Exit");
                                    int bch = sc.nextInt();

                                    switch (bch) {
                                        case 1 -> {
                                            System.out.println("Book1 Title  : " + bg.b.title);
                                            System.out.println("Book1 Author : " + bg.b.author);
                                            System.out.println("Book1 Price  : " + bg.b.price);
                                        }
                                        case 2 -> {
                                            System.out.println("Book2 Title  : " + bg.b1.title);
                                            System.out.println("Book2 Author : " + bg.b1.author);
                                            System.out.println("Book2 Price  : " + bg.b1.price);
                                        }
                                        case 3 -> bookMenu = false;
                                    }
                                }
                            }

                            // ---------------- PEN ----------------
                            case 2 -> {
                                boolean penMenu = true;
                                while (penMenu) {
                                    System.out.println("\n1) Pen1\n2) Pen2\n3) Pen3\n4) Exit");
                                    int pch = sc.nextInt();

                                    switch (pch) {
                                        case 1 -> {
                                            System.out.println("Pen1 Brand : " + bg.p.brand);
                                            System.out.println("Pen1 Color : " + bg.p.color);
                                            System.out.println("Pen1 Price : " + bg.p.price);
                                        }
                                        case 2 -> {
                                            System.out.println("Pen2 Brand : " + bg.p1.brand);
                                            System.out.println("Pen2 Color : " + bg.p1.color);
                                            System.out.println("Pen2 Price : " + bg.p1.price);
                                        }
                                        case 3 -> {
                                            System.out.println("Pen3 Brand : " + bg.p2.brand);
                                            System.out.println("Pen3 Color : " + bg.p2.color);
                                            System.out.println("Pen3 Price : " + bg.p2.price);
                                        }
                                        case 4 -> penMenu = false;
                                    }
                                }
                            }

                            // ---------------- LAPTOP BAG ----------------
                            case 3 -> {
                                boolean lapBagMenu = true;
                                while (lapBagMenu) {
                                    System.out.println("\n1) LaptopBag Details\n2) Open LaptopBag\n3) Exit");
                                    int lch = sc.nextInt();

                                    switch (lch) {
                                        case 1 -> {
                                            System.out.println("LaptopBag Brand : " + bg.lb.brand);
                                            System.out.println("LaptopBag Color : " + bg.lb.color);
                                            System.out.println("LaptopBag Price : " + bg.lb.price);
                                        }
                                        case 2 -> {
                                            boolean laptopMenu = true;
                                            while (laptopMenu) {
                                                System.out.println("\n1) Laptop\n2) Charger\n3) Exit");
                                                int lc = sc.nextInt();

                                                switch (lc) {
                                                    case 1 -> {
                                                        System.out.println("Laptop Brand : " + bg.lb.l.brand);
                                                        System.out.println("Laptop Color : " + bg.lb.l.color);
                                                        System.out.println("Laptop Price : " + bg.lb.l.price);
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Charger Brand : " + bg.lb.c.brand);
                                                        System.out.println("Charger Watt  : " + bg.lb.c.walt);
                                                    }
                                                    case 3 -> laptopMenu = false;
                                                }
                                            }
                                        }
                                        case 3 -> lapBagMenu = false;
                                    }
                                }
                            }

                            case 4 -> insideBag = false;
                        }
                    }
                }

                case 3 -> mainMenu = false;
            }
        }

        sc.close();
    }
}
