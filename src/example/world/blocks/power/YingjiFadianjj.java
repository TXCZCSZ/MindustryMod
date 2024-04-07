package example.world.blocks.power;
import mindustry.world.blocks.power.*;

public class YingjiFadianjj extends ConsumeGenerator {
	public float destroyTime=120f;
    
	public YingjiFadianjj(String name){
		super(name);
		
	}
	public class YingjiFadianjjBuild extends ConsumeGeneratorBuild {
		public boolean isWorking=false;
        @Override
        public void updateEfficiencyMultiplier(){
            if(filterItem != null){
                float m = filterItem.efficiencyMultiplier(this);
                if(m > 0) efficiencyMultiplier = m;
            }else if(filterLiquid != null){
                float m = filterLiquid.efficiencyMultiplier(this);
                if(m > 0) efficiencyMultiplier = m;
            }
            if(power.graph.getBatteryStored() / power.graph.getTotalBatteryCapacity()<= 0.1f){
            isWorking=true;
        }
        if(!isWorking){
            efficiencyMultiplier=0f;
        }
        else{
            efficiencyMultiplier=1f;
        }
        }
        
	}
}
