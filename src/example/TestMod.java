package example;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import example.content.*;
import arc.input.*;
public class TestMod extends Mod{
    

    public TestMod(){
        GestureDetector g = new GestureDetector(null);
        if (g.isLongPressed()) {
            
        }
        Log.info("Loaded ExampleJavaMod constructor.");
        Events.on( WorldLoadBeginEvent.class, e ->{
            Time.runTask(100f, () -> {
                BaseDialog wtf = new BaseDialog("这什么寄吧逆天写法");
                wtf.setColor(0.5f,1,1,1);
                wtf.cont.button("fuck", wtf::hide).size(400f,100f);
                wtf.show();
            });
        });
        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("TXCZCSZ");
                dialog.cont.add("我的第一个模组").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("Test-mod-frog")).pad(20f).row();
                dialog.cont.button("好哎⸜₍๑•⌔•๑₎⸝", dialog::hide).size(200f, 50f);
                dialog.show();
            });
        });
        
    }
		
        
    

    @Override
    public void loadContent(){
            super.loadContent();
            Log.info("Loading some ModernWarfareMod content.");
            TMBlocks.load();
            TMItems.load();
    }
    
   

}
