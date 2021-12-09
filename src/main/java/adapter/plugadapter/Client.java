package adapter.plugadapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void run() {

		EUPowerSupply euPowerSupply1 = new EUPowerSupply();
		EUPowerSupply euPowerSupply2 = new EUPowerSupply();
		EUPowerSupply euPowerSupply3 = new EUPowerSupply();
		
		List<PowerSupply> list = new ArrayList<>();
		list.add(euPowerSupply1);
		list.add(euPowerSupply2);
		list.add(euPowerSupply3);
		
		list.stream().forEach(item -> item.plug());
		
		System.out.println("Adding old legacy system to new system via adapter >>");
		
		UKPowerSupply ukPowerSupply = new UKPowerSupply();
		PowerSupply ukAdapter = new UKAdapter(ukPowerSupply);
		
		System.out.println("Adapter is added..");
		list.add(ukAdapter);
		list.stream().forEach(item -> item.plug());
	}
}
