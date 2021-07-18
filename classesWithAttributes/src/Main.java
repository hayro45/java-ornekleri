public class Main {

    public static void main(String[] args) {
        Prpduct prpduct = new Prpduct();

        prpduct.setName("Laptop");
        prpduct.setId(1);
        prpduct.setDescription("Asus Laptop");
        prpduct.setPrice(5000);
        prpduct.setStockAmount(4);

        ProdactManager prodactManager = new ProdactManager();
        prodactManager.Add(prpduct);
    }
}
