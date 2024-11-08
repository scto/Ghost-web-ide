package Ninja.coder.Ghostemane.code;

import Ninja.coder.Ghostemane.code.ColorAndroid12;
import Ninja.coder.Ghostemane.code.GlideUtilApi.GlideCompat;
import android.app.WallpaperManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.view.Gravity;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.io.IOException;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class SetHomeWallpActivity extends BaseCompat {
  private ImageView imgcontext;
  private ExtendedFloatingActionButton fab;
  private MaterialToolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.setwalpapactivity);
    imgcontext = findViewById(R.id.imgwallpaper);
    fab = findViewById(R.id.fab);
    toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setHomeButtonEnabled(true);
        
    GlideCompat.GlideNormal(imgcontext, getIntent().getStringExtra("img"));
    fab.setText("Select to Walpaper?");
    var shap = new ShapeAppearanceModel.Builder();
    shap.setAllCorners(CornerFamily.CUT, 20f);
    fab.setShapeAppearanceModel(shap.build());
    toolbar.setBackgroundTintList(
        ColorStateList.valueOf(MaterialColors.getColor(toolbar, ColorAndroid12.Back)));
    toolbar.setTitleTextColor(MaterialColors.getColor(toolbar, ColorAndroid12.TvColor));
    fab.setOnClickListener(v -> setWallpaperImageView(imgcontext));
        ClickEffcat(fab);
  }

  public void setWallpaperImageView(ImageView selectedImage) {
    WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
    try {
      Drawable drawable = selectedImage.getDrawable();
      if (drawable instanceof BitmapDrawable) {
        Bitmap wallpaperBitmap = ((BitmapDrawable) drawable).getBitmap();
        wallpaperManager.setBitmap(wallpaperBitmap);
        SketchwareUtil.showMessage(getApplicationContext(), "Setting wallpaper completed 🖼️");
      } else {
        SketchwareUtil.showMessage(getApplicationContext(), "No image found in ImageView 🚫");
      }
    } catch (IOException e) {
      SketchwareUtil.showMessage(getApplicationContext(), "Error setting wallpaper ❌");
      e.printStackTrace();
    }
  }
}
