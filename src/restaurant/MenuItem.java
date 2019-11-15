package restaurant;

public class MenuItem {
    private Integer price;
    private String description;
    private String category;


    public MenuItem(Integer price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
