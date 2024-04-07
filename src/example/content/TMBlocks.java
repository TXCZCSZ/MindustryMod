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

import static mindustry.content.Fx.generatespark;
import static mindustry.gen.Sounds.smelter;
import static mindustry.type.Category.power;
import static mindustry.content.Items.*;

public class TMBlocks {
    public static ConsumeGenerator
    yingjiFadianjj;
    public static void load(){
        yingjiFadianjj = new ConsumeGenerator("YingjiFadianjj"){{
            size=2;//大小
            health=1600;//生命
        }};
    }
}
    