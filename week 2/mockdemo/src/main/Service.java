import com.example.ExternalAPI;

public class Service {
    private final ExternalApi api;
    public Service(ExternalApi api){
        this.api = api;
    }

    public String fetchData(){
        return api.getData();
    }
}
