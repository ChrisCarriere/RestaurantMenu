package restaurant;

import java.util.Date;

public class Menu {
    Boolean isNew;
    Date lastUpdate;

    public Menu(Boolean isNew, Date lastUpdate) {
        this.isNew = isNew;
        this.lastUpdate = lastUpdate;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
