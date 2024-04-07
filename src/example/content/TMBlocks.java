package example.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.mod.*;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.meta.*;
import mindustry.world.blocks.power.PowerNode;
import mindustry.content.Items;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Fx.generatespark;
import static mindustry.gen.Sounds.smelter;
import static mindustry.type.Category.power;
import static mindustry.content.Items.*;

public class TMBlocks {
    public static ConsumeGenerator
    yingjiFadianjj;
    public static void load() {
    yingjiFadianjj = new ConsumeGenerator("yingjiFadianjj") {{
        requirements(Category.power, BuildVisibility.shown, with(Items.copper,5,Items.lead,20));
        health = 2500;
        size = 2;
        buildCostMultiplier = 2f;
        itemCapacity = 30;
        powerProduction = 75f;
        consumeItem(Items.sand,5);
        hasItems=true;
        
        
        }};
    }
    
}
    
