interface Camera {
    void takePicture();
    default void Savepic(){
        System.out.println("Image saved");
    }
    //Default Keyword is used to add some new method in existing Interface so that no error occurs.
}

interface wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone {
    public CellPhone() {
        System.out.println("Connecting...");
    }

    void callNumber(int phonenumber) {
        System.out.println("calling:" + phonenumber);
    }
}

class SmartPhone extends CellPhone implements wifi, Camera/* and many more we can implement */ {
    public void takePicture() {
        System.out.println("Taking picture");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networks = { "om", "Myfi", "FreeWifi" };
        return networks;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
        System.out.println("Connected");
    }
}

public class j_57_DefaultMethods {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.takePicture();
        s.Savepic();
        s.callNumber(1234567890);
        String[] arr = s.getNetworks();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("--" + arr[i] + "--");
        }
        s.connectToNetwork("om");
        //Read default keyword in notes...
    }
}
