package az.main.org;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"intA", "intB"}
)
@XmlRootElement(
        name = "Multiply"
)
public class Multiply {
    protected int intA;
    protected int intB;

    public Multiply() {
    }

    public int getIntA() {
        return this.intA;
    }

    public void setIntA(int var1) {
        this.intA = var1;
    }

    public int getIntB() {
        return this.intB;
    }

    public void setIntB(int var1) {
        this.intB = var1;
    }
}