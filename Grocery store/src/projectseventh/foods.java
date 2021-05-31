
package projectseventh;

import javafx.beans.property.SimpleStringProperty;


public class foods {
    
   private SimpleStringProperty code,name,number,oneCharge,oneDiscount,wholeCharge;

    public foods(String code, String name, String number, String oneCharge, String oneDiscount, String wholeCharge) {
        this.code = new SimpleStringProperty(code);
        this.name = new SimpleStringProperty(name);
        this.number = new SimpleStringProperty(number);
        this.oneCharge = new SimpleStringProperty(oneCharge);
        this.oneDiscount = new SimpleStringProperty(oneDiscount);
        this.wholeCharge = new SimpleStringProperty(wholeCharge);
    }

    public String getCode() {
        return code.get();
    }

    public void setCode(SimpleStringProperty code) {
        this.code = code;
    }

    public String getName() {
        return name.get();
    }

    public void setName(SimpleStringProperty name) {
        this.name = name;
    }

    public String getNumber() {
        return number.get();
    }

    public void setNumber(SimpleStringProperty number) {
        this.number = number;
    }

    public String getOneCharge() {
        return oneCharge.get();
    }

    public void setOneCharge(SimpleStringProperty oneCharge) {
        this.oneCharge = oneCharge;
    }

    public String getOneDiscount() {
        return oneDiscount.get();
    }

    public void setOneDiscount(SimpleStringProperty oneDiscount) {
        this.oneDiscount = oneDiscount;
    }

    public String getWholeCharge() {
        return wholeCharge.get();
    }

    public void setWholeCharge(SimpleStringProperty wholeCharge) {
        this.wholeCharge = wholeCharge;
    }
    
    
    
    
}
