package lesson3.enu;

public enum BookType {
    SCIENCE(1999) {
        @Override
        public int method1() {
            return 0;
        }
    },
    BELLETRE(2000) {
        @Override
        public int method1() {
            return 0;
        }
    },
    PHANTASY{
        public int method1(){
            System.out.println("Method1");
            return 1;
        }
    },
    SCIENCE_FICTION(2015) {
        @Override
        public int method1() {
            return 0;
        }
    };
    private int year;

    BookType() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    BookType(int year) {
        this.year = year;
    }
    public void method(){
        System.out.println(name());
    }
    public abstract int method1();
}
