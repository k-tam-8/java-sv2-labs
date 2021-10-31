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
    }

    public String convertProtocol(String url) {
        return url.substring(0, url.indexOf(":"));
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
        return Integer.parseInt(portString);
    }

    public String convertHost(String url) {
        String hostString = "";
        hostString=url.substring(url.indexOf("://")+3,url.indexOf(url.indexOf("/",url.indexOf("://")+3)));
        return hostString;
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
        URLScan urlScan = new URLScan("https://earthquake.usgs.gov:2560/fdsnws/event/1" +
                "/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        System.out.println(urlScan.getProtocol());
        System.out.println(urlScan.getPort());
    }
    /////////nincs kész
}
