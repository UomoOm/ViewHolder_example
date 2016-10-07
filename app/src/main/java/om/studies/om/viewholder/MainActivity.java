package om.studies.om.viewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> list = generateList();
        listView = (ListView) findViewById(R.id.list_view);
        Adapter adapter = new Adapter(this, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private List<String> generateList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("text #" + i);

        }
        return list;


    }
}
