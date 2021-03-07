package Setter_Getter;

public class TV {
    int channel=1; int volumeLevel=1; boolean on = false;
    String brand = "undefined";
    public TV(){
        System.out.println("Creating TV2 object using no Args- constructor");
    }
    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV2 object using 1 arg - constructor");
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel) {
        if(on) {
            if (volumeLevel > 0 && volumeLevel <= 7) {
                this.volumeLevel = volumeLevel;
            }
        } else{
            System.out.println("ERROR: TV2 is either OFF or invalid Volume level");
        }
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        if(on){
            if(channel>0 && channel<=120){
                this.channel=channel;
            } else{
                System.out.println("ERROR: TV2 is either OFF or invalid Channel");
            }}
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void channelUp(){
        this.channel=channel+1;
    }
    public void channelDown(){
        this.channel=channel-1;
    }
    public void volumeUp(){
        this.volumeLevel=volumeLevel+1;
    }
    public void volumeDown(){
        this.volumeLevel=volumeLevel-1;
    }
    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        if(isOn()) {
            System.out.println("TV2 is already ON");
        }else{
            on = true;
        }
    }
    public void turnOff() {
        if(!isOn()) {
            System.out.println("TV2 is already OFF");
        } else {
            on = false;
        }
    }}