public class Youtube {

    private String apiVersion;
    private Data data;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Youtube() {
    }

    public Youtube(String apiVersion, Data data) {
        this.apiVersion = apiVersion;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Youtube{" +
                "apiVersion='" + apiVersion + '\'' +
                ", data=" + data +
                '}';
    }


}
