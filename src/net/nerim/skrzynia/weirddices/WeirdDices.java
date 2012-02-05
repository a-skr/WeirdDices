package net.nerim.skrzynia.weirddices;

import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class WeirdDices extends Activity
{
    private TextView display;
    private Random random;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
	display = (TextView)this.findViewById(R.id.display);
	random = new Random();
	Button button;

	// d2
	button = (Button)this.findViewById(R.id.button_d2);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(2) + 1;
		display.setText ("" + value);
	    }
	});

	// d3
	button = (Button)this.findViewById(R.id.button_d3);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(3) + 1;
		display.setText ("" + value);
	    }
	});

	// d4
	button = (Button)this.findViewById(R.id.button_d4);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(4) + 1;
		display.setText ("" + value);
	    }
	});

	// d5
	button = (Button)this.findViewById(R.id.button_d5);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(5) + 1;
		display.setText ("" + value);
	    }
	});

	// d6
	button = (Button)this.findViewById(R.id.button_d6);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(6) + 1;
		display.setText ("" + value);
	    }
	});

	// d7
	button = (Button)this.findViewById(R.id.button_d7);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(7) + 1;
		display.setText ("" + value);
	    }
	});

	// d8
	button = (Button)this.findViewById(R.id.button_d8);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(8) + 1;
		display.setText ("" + value);
	    }
	});

	// d10
	button = (Button)this.findViewById(R.id.button_d10);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(10) + 1;
		display.setText ("" + value);
	    }
	});

	// d12
	button = (Button)this.findViewById(R.id.button_d12);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(12) + 1;
		display.setText ("" + value);
	    }
	});

	// d14
	button = (Button)this.findViewById(R.id.button_d14);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(14) + 1;
		display.setText ("" + value);
	    }
	});

	// d16
	button = (Button)this.findViewById(R.id.button_d16);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(16) + 1;
		display.setText ("" + value);
	    }
	});

	// d20
	button = (Button)this.findViewById(R.id.button_d20);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(20) + 1;
		display.setText ("" + value);
	    }
	});

	// d24
	button = (Button)this.findViewById(R.id.button_d24);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(24) + 1;
		display.setText ("" + value);
	    }
	});

	// d30
	button = (Button)this.findViewById(R.id.button_d30);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(30) + 1;
		display.setText ("" + value);
	    }
	});

	// d100
	button = (Button)this.findViewById(R.id.button_d100);
	button.setOnClickListener(new View.OnClickListener() {
	    @Override
            public void onClick(View v) {
		int value = random.nextInt(100) + 1;
		display.setText ("" + value);
	    }
	});

    }
}