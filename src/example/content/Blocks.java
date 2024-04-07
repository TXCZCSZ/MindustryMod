package mindustry.content;
import mindustry.*;
import mindustry.world.Block.*;
import mindustry.world.blocks.power.*;
public class CustomBlocks {
    public static Block 
    YingjiFadianjj;
    public static void load(){
        YingjiFadianjj = new YingjiFadianjj("应急发电机"){{
            requirements(Category.power, with(Items.copper, 1, Items.lead, 3));
            maxNodes = 10;
            laserRange = 6;
        }};
    }
}
    
