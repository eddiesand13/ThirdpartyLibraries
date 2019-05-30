package eddie.example.thirdpartylibraries;

//import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import com.github.johnpersano.supertoasts.library.Style;
//import com.github.johnpersano.supertoasts.library.SuperActivityToast;

//import static com.github.johnpersano.supertoasts.library.utils.PaletteUtils.MATERIAL_PURPLE;
//import static com.github.johnpersano.supertoasts.library.utils.PaletteUtils.getSolidColor;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  SuperActivityToast.create(this, new Style(), Style.TYPE_BUTTON)
                .setButtonText("UNDO")
                .setOnButtonClickListener("good_tag_name", null, null)
                .setProgressBarColor(Color.WHITE)
                .setText("Email deleted")
                .setDuration(Style.DURATION_LONG)
                .setFrame(Style.FRAME_LOLLIPOP)
                .setColor(getSolidColor(MATERIAL_PURPLE))
                .setAnimations(Style.ANIMATIONS_POP).show();*/
    }
}
