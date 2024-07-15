package example.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.meta.*;
import static mindustry.type.ItemStack.*;

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

