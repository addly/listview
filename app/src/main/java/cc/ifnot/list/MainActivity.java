package cc.ifnot.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(new CCAdapter());
    }

    private class CCAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 0;
            /** 返回的是数据的条数*/
        }

        @Override
        public Object getItem(int i) {
            return null;
            /** 这个方法可以不关注
             * 一般开发用不上*/
        }

        @Override
        public long getItemId(int i) {
            return 0;
            /** 这个一般也暂时用不上， 用上再说*/
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}
