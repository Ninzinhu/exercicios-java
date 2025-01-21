package poo.InVoice;

public class InVoice {

    private int itemNumber;
    private String description;
    private int amount;
    private float priceUnit;


    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            this.amount = 0;
        } else {
            this.amount = amount;
        }
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        if (priceUnit < 0) {
            this.priceUnit = 0;
        } else {
            this.priceUnit = priceUnit;
        }

    }

    public InVoice(int itemNumber, String description, int amount, float priceUnit) {
        this.setItemNumber(itemNumber);
        this.setDescription(description);
        this.setPriceUnit(priceUnit);
        this.setAmount(amount);


    }

    public double getInvoiceAmount() {
        return amount * priceUnit;

    }
}

