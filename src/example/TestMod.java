package example;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.content.*;
import example.content.*;

import arc.graphics.g2d.*;
import arc.input.GestureDetector.*;
import arc.input.*;
import arc.math.*;
import arc.math.geom.*;
import arc.scene.*;
import arc.scene.ui.ImageButton.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.core.*;
import mindustry.entities.*;
import mindustry.entities.units.*;
import mindustry.game.EventType.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;

import static arc.Core.*;
import static mindustry.Vars.*;
import static mindustry.input.PlaceMode.*;

public class TestMod extends Mod{
    private Vec2 touchPoint = new Vec2();
    @Override
    public void init() {
      Events.on(ClientLoadEvent.class, event ->{
        Core.input.addProcessor(new InputProcessor() {
          @Override
          public void touchDown(int screenX, int screenY, int pointer, int button) {
            touchPoint.set(screenX, screenY);
          }
        });
      });
    }

    public TestMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

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
    
    @Override
    public void update() {
      Draw.color(Color.red); 
      Draw.alpha(0.5f); 
      Fill.circle(touchPoint.x, touchPoint.y, 10);
    }
    

}
