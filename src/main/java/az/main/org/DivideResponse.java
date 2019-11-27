package az.main.org;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"divideResult"}
)
@XmlRootElement(
        name = "DivideResponse"
)
public class DivideResponse {
    @XmlElement(
            name = "DivideResult"
    )
    protected int divideResult;

    public DivideResponse() {
    }

    public int getDivideResult() {
        return this.divideResult;
    }

    public void setDivideResult(int var1) {
        this.divideResult = var1;
    }
}
