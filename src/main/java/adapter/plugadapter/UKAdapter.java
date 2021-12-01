package adapter.plugadapter;

public class UKAdapter implements PowerSupply {

	private UKPowerSupply ukPowerSupply;
	
	public UKAdapter(UKPowerSupply ukPowerSupply) {
		this.ukPowerSupply = ukPowerSupply;
	}
	
	public void plug() {
		ukPowerSupply.getPower();
	}
}
