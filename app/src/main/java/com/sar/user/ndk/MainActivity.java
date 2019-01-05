package com.sar.user.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
@BindView(R.id.button)
Button button;
    @BindView(R.id.editText)
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(!editText.getText().toString().equals(null));
        {
            int no=Integer.parseInt(editText.getText().toString());
            if(isprime(no))
            {
                Toast.makeText(MainActivity.this,"This is prime number",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this,"This is not prime number",Toast.LENGTH_SHORT).show();
            }
        }
    }
});
        // Example of a call to a native method

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native boolean isprime(int ab);
}
