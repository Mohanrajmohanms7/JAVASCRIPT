activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent" tools:context=".MainActivity">
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content" android:text="Hello World!"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />
<RelativeLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:paddingLeft="10dp"
android:paddingRight="10dp">
<Button android:id="@+id/btnTakePicture"
android:layout_width="wrap_content"
android:layout_height="wrap_content" android:text="Take a
Photo" android:textStyle="bold"
android:layout_centerHorizontal="true"
android:layout_alignParentBottom="true" />
<ImageView
android:layout_width="fill_parent"
android:layout_height="fill_parent"
android:id="@+id/capturedImage"
android:layout_above="@+id/btnTakePict
ure"/>
</RelativeLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
`
MainActivity.java
package
com.example.labex8;
import
android.content.Intent;
import
android.graphics.Bitmap;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity
{
private Button btnCapture;
private ImageView imgCapture;
private static final int Image_Capture_Code = 1;
@Override
protected void onCreate(Bundle savedInstanceState)
{ super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
btnCapture =(Button)findViewById(R.id.btnTakePicture);
imgCapture = (ImageView) findViewById(R.id.capturedImage);
btnCapture.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v) {
Intent cInt = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
startActivityForResult(cInt,Image_Capture_Code);
}
});
}
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent
data) {
if (requestCode == Image_Capture_Code)
{
if (resultCode == RESULT_OK) {
Bitmap bp = (Bitmap) data.getExtras().get("data");
imgCapture.setImageBitmap(bp);
} else if (resultCode == RESULT_CANCELED) {
Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
}
} } }