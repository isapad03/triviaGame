public class Packet {
    private String command;
    private String data;
    private int playerID;
    private String packetData;



    public Packet(String command, String data, int playerID){
        this.command = command;
        this.data = data;
        this.playerID = playerID;
        packetData = this.command +"," + this.data + "," + this.playerID;
    }

    public Packet(String command, String data){
        this.command = command;
        this.data = data;
        this.playerID = -10;
        packetData = this.command +"," + this.data + "," + this.playerID;
    }

    public Packet(String command, int playerID){
        this.command = command;
        this.playerID = playerID;
        this.data = "xxx";
        packetData = this.command +"," + this.data + "," + this.playerID;
    }
public Packet(String command){
        this.command = command;
        this.data = "xxx";
        this.playerID = -10;
    packetData = this.command +"," + this.data + "," + this.playerID;
}


public String getPacketData(){
        System.out.println(packetData);
        return packetData;


}
}
