package com.card.stackcard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.wenchao.cardstack.CardStack;
public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {
    CardStack stack;
    StackAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter=new StackAdapter(getApplicationContext(),0);
        initImages();
        stack=findViewById(R.id.cardsStack);
        stack.setContentResource(R.layout.cards);
        stack.setStackMargin(20);
        stack.setAdapter(adapter);
        stack.setListener(this);
    }
    private void initImages() {
        adapter.add(R.drawable.goku);
        adapter.add(R.drawable.goku1);
        adapter.add(R.drawable.goku);
        adapter.add(R.drawable.goku1);
        adapter.add(R.drawable.mount);
        adapter.add(R.drawable.mount);
    }
    @Override
    public boolean swipeEnd(int i, float v) {
        Toast.makeText(this, ""+i, Toast.LENGTH_SHORT).show();
        adapter.add(adapter.getItem(i));
     return true;
    }
    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }
    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        Toast.makeText(this, ""+i, Toast.LENGTH_SHORT).show();
        adapter.add(adapter.getItem(i));
        return true;
    }
    @Override
    public void discarded(int i, int i1) {
    }
    @Override
    public void topCardTapped() {

    }

}