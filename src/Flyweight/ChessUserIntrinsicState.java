package Flyweight;

import java.util.Arrays;

public class ChessUserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;

    public ChessUserIntrinsicState(String name, int age, String gender, String email, String phoneNumber, Byte[] photo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "ChessUserIntrinsicState {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", photo=" + Arrays.toString(photo) +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Byte[] getPhoto() {
        return photo;
    }
}
