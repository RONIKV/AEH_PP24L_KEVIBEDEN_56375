public class myNinthApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(1, 5000, "Owner Name", "owner@example.com", "123-456-7890");
        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("owner@email.pl", "+48 123 456 789");
        warehouse.addGoods(600);
    }
}
