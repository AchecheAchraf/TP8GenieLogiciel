package champollion;

public class ServicePrevu {
	private int volumeCM;
	private int volumeTD;
	private int volumeTP;
	private UE ue;

	public ServicePrevu(int a,int b,int c,UE ue){
		this.volumeCM=a;
		this.volumeTD=b;
		this.volumeTP=c;
		this.ue=ue;
	}

	public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public UE getUe() {
        return ue;
    }

    public void setVolumeCM(int volumeCM) {
        this.volumeCM = volumeCM;
    }

    public void setVolumeTD(int volumeTD) {
        this.volumeTD = volumeTD;
    }

    public void setVolumeTP(int volumeTP) {
        this.volumeTP = volumeTP;
    }

}
