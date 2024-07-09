public class AppConfi {
    
    private String serverUrl;
    private int puerto;

  
    private static AppConfi instance;

    private AppConfi() {
    }

    public static synchronized AppConfi getInstance() {
        if (instance == null) {
            instance = new AppConfi();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    
}