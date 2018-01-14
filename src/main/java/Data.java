import java.util.List;

public class Data {

    private List<Item> items;

    private Long itemsPerPage;

    private Long startIndex;
    private Long totalItems;
    private String updated;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public Long getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Data() {
    }

    public Data(List<Item> items, Long itemsPerPage, Long startIndex, Long totalItems, String updated) {
        this.items = items;
        this.itemsPerPage = itemsPerPage;
        this.startIndex = startIndex;
        this.totalItems = totalItems;
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Data{" +
                "items=" + items +
                ", itemsPerPage=" + itemsPerPage +
                ", startIndex=" + startIndex +
                ", totalItems=" + totalItems +
                ", updated='" + updated + '\'' +
                '}';
    }
}
