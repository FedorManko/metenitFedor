package lesson10.sort;

class Phone{

    private String name;
    private String company;
    private int price;

    public Phone(String name, String comp, int price){
        this.name=name;
        this.company=comp;
        this.price = price;
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getCompany() { return company; }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

