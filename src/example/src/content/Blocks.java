package example.content;

import example.world.blocks.power.*;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.mod.*;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.meta.*;
import mindustry.world.blocks.power.PowerNode;
import modernwarfare.content.MWItems;

import static mindustry.content.Fx.generatespark;
import static mindustry.gen.Sounds.smelter;
import static mindustry.type.Category.power;
import static modernwarfare.content.MWItems.*;

public class Blocks {
    public static ConsumeGenerator
    yingjiFadianjj;
    public static void load(){
        YingjiFadianjj = new ConsumeGenerator("YingjiFadianjj"){{
            size=2;//大小
            health=1600;//生命
        }};
    }
}
    
