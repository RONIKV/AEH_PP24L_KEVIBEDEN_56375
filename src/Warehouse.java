class Warehouse {
    private int warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    public Warehouse(int warehouseNumber, int totalSpace, String ownerName, String ownerEmail, String ownerPhone) {
        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.occupiedSpace = 0;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    // Getters
    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public int getTotalSpace() {
        return totalSpace;
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    // Setters
    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public void setTotalSpace(int totalSpace) {
        this.totalSpace = totalSpace;
    }

    public void setOccupiedSpace(int occupiedSpace) {
        this.occupiedSpace = occupiedSpace;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    // Methods
    public void addGoods(int amount) {
        if (occupiedSpace + amount <= totalSpace) {
            occupiedSpace += amount;
            System.out.println(amount + " units of goods added. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    public void removeGoods(int amount) {
        if (occupiedSpace >= amount) {
            occupiedSpace -= amount;
            System.out.println(amount + " units of goods removed. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough goods in the warehouse. Current occupied space: " + occupiedSpace + " units.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Current occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Current available warehouse space: " + (totalSpace - occupiedSpace) + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        ownerEmail = newEmail;
        ownerPhone = newPhone;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + ownerEmail);
        System.out.println("New phone number: " + ownerPhone);
    }
}

