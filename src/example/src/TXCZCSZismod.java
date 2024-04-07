package example;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.content.*;

public class TXCZCSZismod extends Mod{

    public TXCZCSZismod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("TXCZCSZ");
                dialog.cont.add("我的第一个模组").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("好哎⸜₍๑•⌔•๑₎⸝", dialog::hide).size(200f, 50f);
                dialog.show();
            });
        });
    }
		
        
    

    @Override
    public void loadContent(){
            super.loadContent();
            Log.info("Loading some ModernWarfareMod content.");
            Blocks.load();
    }
}
