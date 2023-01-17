import javax.swing.plaf.synth.SynthTreeUI;

public class Landline implements phone {


    private String myphonenumber;
    private boolean isRinging;
    private  boolean isPoweron;

 public Landline(String myphoneNo){
     this.myphonenumber = myphoneNo;
     isRinging=false;
     isPoweron=true;
 }

    public String getPhonenumber() {
        return myphonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.myphonenumber = phonenumber;
    }


    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void setPoweron(boolean poweron) {
        isPoweron = poweron;
    }

    @Override
    public void poweron() {
        this.isPoweron=true;

    }

    @Override
    public void callnumber(String phoneno) {
if(isPoweron==true){
    System.out.print("calling to "+phoneno);
}
else{
    System.out.println("could not call the no.you dail is currently switch off");
    return ;
}

    }

    @Override
    public void receivecall(String phoneno) {
if(isPoweron && myphonenumber.equals(phoneno) ){
this.isRinging =true;
System.out.print("hey"+ myphonenumber+ "you are receiving call");
}
else{
    System.out.print("call not received");
}
    }

    @Override
    public boolean answercall() {
        if(isRinging==true){
            System.out.print("call answeres");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
