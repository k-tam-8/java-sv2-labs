package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        validateIpAndHost(hostName, hostIp);
        dnsEntries.add(new DnsEntry(hostIp, hostName));
    }

    private void validateIpAndHost(String hostName, String hostIp) {
        for (DnsEntry de : dnsEntries) {
            if (de.getDomainName().equals(hostName) || de.getIpAddress().equals(hostIp)) {
                throw new IllegalArgumentException("Already exists!");
            }
        }
    }

    public void removeEntryByName(String name) {
        for (int i = 0; i < dnsEntries.size(); i++) {
            if (dnsEntries.get(i).getDomainName().equals(name)) {
                dnsEntries.remove(i);
                i--;
            }
        }
    }

    public void removeEntryByIp(String ipAddress) {
        for (int i = 0; i < dnsEntries.size(); i++) {
            if (dnsEntries.get(i).getIpAddress().equals(ipAddress)) {
                dnsEntries.remove(i);
                i--;
            }
        }
    }

    public String getIpByName(String name) {
        for (DnsEntry de : dnsEntries) {
            if (de.getDomainName().equals(name)) {
                return de.getIpAddress();
            }
        }
        throw new IllegalArgumentException("Element not found!");
    }

    public String getNameByIp(String ipAddress) {
        for (DnsEntry de : dnsEntries) {
            if (de.getIpAddress().equals(ipAddress)) {
                return de.getDomainName();
            }
        }
        throw new IllegalArgumentException("Element not found!");
    }

    public static class DnsEntry {
        private String ipAddress;
        private String domainName;

        public DnsEntry(String ipAddress, String domainName) {
            this.ipAddress = ipAddress;
            this.domainName = domainName;
        }

        public String getIpAddress() {
            return ipAddress;
        }

        public String getDomainName() {
            return domainName;
        }
    }

}
