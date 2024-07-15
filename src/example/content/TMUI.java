package example.content;

import arc.scene.ui.Dialog;
import arc.scene.ui.layout.Cell;
import arc.scene.ui.layout.Table;
import example.TestMod;
import mindustry.ui.dialogs.BaseDialog;

public class TMUI extends Dialog{
    public  void load(){
        buttons.button("Test", (Runnable) new BaseDialog("test"){
            
        }.show());
    }
}
