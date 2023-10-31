activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayo
ut
xmlns:android="http://schemas.android.com/apk
/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent" tools:context=".MainActivity">
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello World!"
app:layout_constraintBottom_toBottomOf=
"parent"
app:layout_constraintLeft_toLeftOf="parent
"
app:layout_constraintRight_toRightOf="par
ent"
app:layout_constraintTop_toTopOf="parent
" />
<RelativeLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent">
<ImageView android:id="@+id/imageView"
android:layout_width="338dp" android:layout_height="309dp"
android:layout_alignParentStart="true"
android:layout_alignParentTop="true"
android:layout_alignParentEnd="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="44dp"
android:layout_marginTop="56dp"
android:layout_marginEnd="29dp"
android:layout_marginBottom="366dp"
android:src="@drawable/sonacas" />
`
<Button android:id="@+id/button"
android:layout_width="272dp"
android:layout_height="97dp"
android:layout_alignParentStart="true"
android:layout_alignParentEnd="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="65dp"
android:layout_marginEnd="74dp"
android:layout_marginBottom="253dp"
android:text="ENTER TO GO"
android:background="#3f76ff"
android:textColor="#ffff" />
android:layout_marginStart="65dp"
android:layout_marginEnd="74dp"
android:layout_marginBottom="253dp"
android:text="ENTER TO GO"
android:background="#3f76ff"
android:textColor="#ffff" />

</RelativeLayout>