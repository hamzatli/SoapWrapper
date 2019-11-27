package az.main.org;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"subtractResult"}
)
@XmlRootElement(
        name = "SubtractResponse"
)
public class SubtractResponse {
    @XmlElement(
            name = "SubtractResult"
    )
    protected int subtractResult;

    public SubtractResponse() {
    }

    public int getSubtractResult() {
        return this.subtractResult;
    }

    public void setSubtractResult(int var1) {
        this.subtractResult = var1;
    }
}
