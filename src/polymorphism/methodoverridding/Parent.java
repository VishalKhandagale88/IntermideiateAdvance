package polymorphism.methodoverridding;

import java.util.Arrays;
import java.util.Objects;

public class Parent {
    private int bankBalance;
    private String property;
    private String marriage;

    public Parent(int bankBalance, String property, String marriage) {
        this.bankBalance = bankBalance;
        this.property = property;
        this.marriage = marriage;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "bankBalance=" + bankBalance +
                ", property='" + property + '\'' +
                ", marriage='" + marriage + '\'' +
                '}';
    }
    public String marriage(){
        return "the girl we like";
    }
}
