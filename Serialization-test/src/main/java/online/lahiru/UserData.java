package online.lahiru;

import java.util.Arrays;

public class UserData {
    private String id;
    private String name;
    private String address;
    private byte[] bytes;

    public UserData() {
    }

    public UserData(String id, String name, String address, byte[] bytes) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bytes = bytes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bytes=" + Arrays.toString(bytes) +
                '}';
    }
}
