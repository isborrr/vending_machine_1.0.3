package GuidedLAB303117;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap {

    private TreeMap<String, String> data;


    public PhoneDirectoryWithTreeMap() {
        this.data = new TreeMap<String, String>();
    }

    public String getNumber(String name) {
        return this.data.get(name);
    }


    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        this.data.put(name, number);

    }

    public void print() {
        for (Map.Entry<String, String> entry : this.data.entrySet())
            System.out.println(entry.getKey() + ":  " + entry.getValue());


    }

    public static void main(String[] args) {
        PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
        directory.putNumber("Alice", "1234");
        directory.putNumber("Bob", "5678");
        directory.print();
        System.out.println("Alice's number: " + directory.getNumber("Alice"));


    }
}
