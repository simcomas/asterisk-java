package org.asteriskjava.manager.event;

public class PickupEvent extends AbstractChannelEvent
{
    private String linkedid;
    private String targetchannel;

    private String targetChannelState;
    private String targetChannelStateDesc;
    private String targetCallerIDNum;
    private String targetCallerIDName;
    private String targetConnectedLineNum;
    private String targetConnectedLineName;
    private String targetAccountCode;
    private String targetContext;
    private String targetExten;
    private String targetPriority;
    private String targetUniqueid;
    private String targetLinkedid;

    public PickupEvent(Object source)
    {
            super(source);
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String getTargetchannel()
    {
        return targetchannel;
    }

    public void setTargetchannel(String targetchannel)
    {
        this.targetchannel = targetchannel;
    }

    /**
     * Uniqueid of the oldest channel associated with this channel
     * <p>
     * This property is available since Asterisk 13.
     *
     * @return Uniqueid of the oldest channel associated with this channel
     */
    public String getLinkedid()
    {
        return linkedid;
    }

    public void setLinkedid(String linkedid)
    {
        this.linkedid = linkedid;
    }

    public String getTargetChannelState() {
        return targetChannelState;
    }

    public void setTargetChannelState(String targetChannelState) {
        this.targetChannelState = targetChannelState;
    }

    public String getTargetChannelStateDesc() {
        return targetChannelStateDesc;
    }

    public void setTargetChannelStateDesc(String targetChannelStateDesc) {
        this.targetChannelStateDesc = targetChannelStateDesc;
    }

    public String getTargetCallerIDNum() {
        return targetCallerIDNum;
    }

    public void setTargetCallerIDNum(String targetCallerIDNum) {
        this.targetCallerIDNum = targetCallerIDNum;
    }

    public String getTargetCallerIDName() {
        return targetCallerIDName;
    }

    public void setTargetCallerIDName(String targetCallerIDName) {
        this.targetCallerIDName = targetCallerIDName;
    }

    public String getTargetConnectedLineNum() {
        return targetConnectedLineNum;
    }

    public void setTargetConnectedLineNum(String targetConnectedLineNum) {
        this.targetConnectedLineNum = targetConnectedLineNum;
    }

    public String getTargetConnectedLineName() {
        return targetConnectedLineName;
    }

    public void setTargetConnectedLineName(String targetConnectedLineName) {
        this.targetConnectedLineName = targetConnectedLineName;
    }

    public String getTargetAccountCode() {
        return targetAccountCode;
    }

    public void setTargetAccountCode(String targetAccountCode) {
        this.targetAccountCode = targetAccountCode;
    }

    public String getTargetContext() {
        return targetContext;
    }

    public void setTargetContext(String targetContext) {
        this.targetContext = targetContext;
    }

    public String getTargetExten() {
        return targetExten;
    }

    public void setTargetExten(String targetExten) {
        this.targetExten = targetExten;
    }

    public String getTargetPriority() {
        return targetPriority;
    }

    public void setTargetPriority(String targetPriority) {
        this.targetPriority = targetPriority;
    }

    public String getTargetUniqueid() {
        return targetUniqueid;
    }

    public void setTargetUniqueid(String targetUniqueid) {
        this.targetUniqueid = targetUniqueid;
    }

    public String getTargetLinkedid() {
        return targetLinkedid;
    }

    public void setTargetLinkedid(String targetLinkedid) {
        this.targetLinkedid = targetLinkedid;
    }

}
