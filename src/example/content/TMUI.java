package example.content;

import arc.scene.ui.Dialog;
import arc.scene.ui.layout.Cell;
import arc.scene.ui.layout.Table;
import example.TestMod;
import mindustry.ui.dialogs.BaseDialog;

public class TMUI extends Dialog{
    public  void load(){
        setBackground(null);
        setFillParent(false);
        setRotation(45);
        BaseDialog a = new BaseDialog("test");
        a.cont.button("back", a::hide).size(100,100);
        buttons.button("Test", a::show).size(200,200);
    }
}
