activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLay
out
xmlns:android="http://schemas.android.com/apk
/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent" tools:context=".MainActivity">
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello World!"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />
<EditText android:id="@+id/editText"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginEnd="8dp"
android:layout_marginStart="8dp"
android:layout_marginTop="60dp" android:ems="10"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.575"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />
<Button android:id="@+id/button"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginRight="8dp"
android:layout_marginLeft="156dp"
android:layout_marginTop="172dp" android:text="Visit"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.0"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/editText" />
</androidx.constraintlayout.widget.ConstraintLayout>
`
MainActivity.java
package
com.example.labex3;
import
android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import
android.widget.Button;
import
android.widget.EditText;
public class MainActivity extends
AppCompatActivity { Button button;
EditText editText;
@Override
protected void onCreate(Bundle
savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
button = findViewById(R.id.button);
editText = findViewById(R.id.editText);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
String url=editText.getText().toString();
Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
startActivity(intent);
}
});
}
}
