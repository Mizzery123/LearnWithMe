package sg.edu.rp.c346.learnwithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitActivity extends AppCompatActivity {
    GridView gridView;

    String[] fruitNames = {"Apple","Orange","Strawberry","Melon","Kiwi","Banana","Papaya","Durian","Cherry","Grape"};
    int[] fruitImages = {R.drawable.apple,R.drawable.oranges,R.drawable.strawberry,R.drawable.watermelon,R.drawable.kiwi,R.drawable.banana, R.drawable.papaya, R.drawable.durian, R.drawable.cherry, R.drawable.grape};
    String[] fruitDescriptions = {"An apple is a sweet, edible fruit produced by an apple tree (Malus domestica). Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today.",
    "An orange is a type of citrus fruit that people often eat. Oranges are a very good source of vitamin. Orange juice is an important part of many people's breakfast. The \"sweet orange\", which is the kind that are most often eaten today, grew first in South and East Asia but now grows in lots of parts of the world.",
    "Strawberries are red, heart-shaped fruits. They are eaten fresh, often with cream. They are also used as a filling for pastries, pies, and cakes. Strawberries are rich in vitamin C, and they also contain iron and other minerals.",
    "Melons are sweet fruits. They have a fragrant, juicy inside that is usually eaten fresh. Melons are a good source of vitamins A and C. Common melons include cantaloupe, honeydew, and casaba. ",
    "Kiwifruit (Actinidia deliciosa) is a fruit. It has an oval shape, and is green on the inside with small black seeds that are edible. The kiwi has furry brown skin that is edible but is usually removed. The skin is relatively thin. The kiwi is native to South China.",
    "Bananas are one of the most important and popular foods in the world. They are a flavorful fruit that is full of vitamins. They can be found in stores throughout the year.",
    "Papayas are tropical fruits. They look like small cantaloupes or honeydew melons. In some places papayas are called papaws or pawpaws. The scientific name of the papaya plant is Carica papaya.",
    "A spiny oval tropical fruit containing a creamy pulp. Despite its fetid smell it is highly valued for its flavour.",
    "Cherries are small, round fruits that can be sweet or sour. They grow on trees that are also known for their flowers. Cherry trees grow throughout the world, in areas that do not get extreme heat or cold.",
    "Grapes are bulb-shaped fruits. They can be eaten fresh, dried to make raisins, or crushed to make grape juice or wine. There are more than 8,000 varieties of grape."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        //finding listview
        gridView = findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),GridItemActivity.class);
                intent.putExtra("name",fruitNames[i]);
                intent.putExtra("image",fruitImages[i]);
                intent.putExtra("description", fruitDescriptions[i]);
                startActivity(intent);

            }
        });


    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data

            ImageView image = view1.findViewById(R.id.images);


            image.setImageResource(fruitImages[i]);
            return view1;



        }
    }
}
