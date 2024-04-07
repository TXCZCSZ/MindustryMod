import mindustry.content.Blocks;
import mindustry.world.Block;
public class CustomBlocks {}
    public static Block customBlock; // 定义自定义方块变量 
    public static void registerBlocks() { 
        customBlock = new YingjiFadianjj("应急发电机"); // 创建自定义方块实例 
        Blocks.blocks.add(customBlock); // 将自定义方块添加到游戏方块列表中 
    } 
}