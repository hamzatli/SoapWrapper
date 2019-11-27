package az.main.org;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"addResult"}
)
@XmlRootElement(
        name = "AddResponse"
)
public class AddResponse {
    @XmlElement(
            name = "AddResult"
    )
    protected int addResult;

    public AddResponse() {
    }

    public int getAddResult() {
        return this.addResult;
    }

    public void setAddResult(int var1) {
        this.addResult = var1;
    }
}
