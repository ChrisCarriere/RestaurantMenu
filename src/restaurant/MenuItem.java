package restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {

    private Integer id;
    private String name;
    private String description;
    private String category;
    private Double price;
    private Date lastUpdateDate;
    private static final String MENU_NAME = "Chris's Taco Shop";

    public MenuItem(Integer id, String name, String description, String category, Double price, Date lastUpdateDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.lastUpdateDate = lastUpdateDate;
    }
    public static String getMenuName() {
        return MENU_NAME;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return " \n {" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", lastUpdateDate=" + lastUpdateDate +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(getId(), menuItem.getId()) &&
                Objects.equals(getName(), menuItem.getName()) &&
                Objects.equals(getDescription(), menuItem.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription());
    }
}