package stringmethods;

public class URLScan {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public URLScan(String url) {
        this.protocol = convertProtocol(url);
        this.port = convertPort(url);
        this.host = convertHost(url);
        this.path = convertPath(url);
        this.query = convertQuery(url);
    }

    public String convertProtocol(String url) {
        return url.substring(0, url.indexOf(":")).toLowerCase();
    }

    public int convertPort(String url) {
        String portString = "";
        for (int i = 0; i < url.length(); i++) {
            if (Character.toString(url.charAt(i)).equals(":") && Character.isDigit(url.charAt(i + 1))) {
                int j = 1;
                while (Character.isDigit(url.charAt(i + j))) {
                    portString += url.charAt(i + j);
                    j++;
                }
            }
        }
        if (portString != "") {
            return Integer.parseInt(portString);
        } else return 0;
    }

    public String convertHost(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf(":", startIndex);
        if (endIndex < 0) {
            endIndex = url.indexOf("/", startIndex);
        }
        if (endIndex < 0) {
            endIndex = url.length();
        }
        String s = url.substring(startIndex, endIndex);
        return s.toLowerCase();
    }

    public String convertPath(String url) {
        String s = "";
        int startIndex = url.indexOf("/", 9);
        int endIndex = url.indexOf("?", startIndex);
        if (endIndex < 0) {
            endIndex = url.length();
        }
        if (startIndex > 0) {
            s = url.substring(startIndex + 1, endIndex);
        }
        return s;
    }

    public String convertQuery(String url) {
        String s = "";
        int startIndex=url.indexOf("?");
        if (startIndex>0){
            s+=url.substring(startIndex+1);
        }
        return s;
    }

    public boolean hasProperty(String key) {
        return false; //ez mire van?
    }
    public String getProperty(String key) {
        return "";
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public static void main(String[] args) {
         URLScan urlScan = new URLScan("https://earthquake.usgs.gov:51265/fdsnws/event/1" +
                "/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        //URLScan urlScan = new URLScan("http://www.sony.com/");
        System.out.println("protokoll: " + urlScan.getProtocol());
        System.out.println("host: " + urlScan.getHost());
        System.out.println("port: " + urlScan.getPort());
        System.out.println("path: " + urlScan.getPath());
    }
}
