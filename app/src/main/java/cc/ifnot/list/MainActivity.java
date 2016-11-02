package cc.ifnot.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** 1. 最简单的listview， 以后再有再补充
         *  需求： 一个字符List， 展示到对应的VIew上即可
         *
         *      * 数据源
         *      * 单个item UI
         *
         * */

        strings = new ArrayList<>();
        strings.add("hello1");
        strings.add("hello2");
        strings.add("hello3");
        strings.add("hello4");
        strings.add("hello5");
        strings.add("hello6");
        strings.add("hello7");



        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(new CCAdapter());
    }

    private class CCAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return strings.size();
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
            /** 返回对应索引 i 对应的View对象
             *
             * 1. 代码创建对象
             *
             * */

            TextView textView = new TextView(MainActivity.this);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            textView.setLayoutParams(layoutParams);

            textView.setText(strings.get(i));

            return textView;
        }
    }
}
