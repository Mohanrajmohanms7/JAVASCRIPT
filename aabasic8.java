activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<TextView
xmlns:android="http://schemas.android.com/apk/res/andr
oid" android:layout_width="fill_parent"
android:layout_height="fill_parent"
android:padding="10dp"
android:textSize="20sp" >
</TextView>
MainActivity.java
package com.example.labex9; import
android.app.ListActivity; import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
public class MainActivity extends ListActivity {
static final String[] FRUITS = new String[] { "Apple", "Avocado",
"Banana", "Blueberry", "Coconut", "Durian", "Guava",
"Kiwifruit",
"Jackfruit", "Mango", "Olive", "Pear", "Sugar-
apple" };
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setListAdapter(new ArrayAdapter<String>(this,
R.layout.activity_main,FRUITS)); ListView listView = getListView();
listView.setTextFilterEnabled(true);
listView.setOnItemClickListener(new OnItemClickListener() {
public void onItemClick(AdapterView<?> parent,
View view, int position, long id) {
`
}
});
// When clicked, show a toast with the TextView text
Toast.makeText(getApplicationContext(),
((TextView) view).getText(), Toast.LENGTH_SHORT).show();
}
}
