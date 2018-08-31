/**
 * Created by Gujarati on 11-02-2018.
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PersistentBottomSheetActivity extends AppCompatActivity {

    private BottomSheetBehavior bottomSheetBehavior ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persistent_bottomsheet);

        final View viewBottomSheet = findViewById(R.id.bottom_sheet) ;
        bottomSheetBehavior = BottomSheetBehavior.from(viewBottomSheet) ;
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

                switch (newState) {

                    case BottomSheetBehavior.STATE_COLLAPSED:{

                        Log.d("BSB","collapsed") ;
                    }
                    case BottomSheetBehavior.STATE_SETTLING:{

                        Log.d("BSB","settling") ;
                    }
                    case BottomSheetBehavior.STATE_EXPANDED:{

                        Log.d("BSB","expanded") ;
                    }
                    case BottomSheetBehavior.STATE_HIDDEN: {

                        Log.d("BSB" , "hidden") ;
                    }
                    case BottomSheetBehavior.STATE_DRAGGING: {

                        Log.d("BSB","dragging") ;
                    }
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

                Log.d("BSB","sliding " + slideOffset ) ;
            }
        });

        Button btnExpand = (Button)findViewById(R.id.button_expand);
        btnExpand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        Button btnHide = (Button)findViewById(R.id.button_hide) ;
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
            }
        });

        Button btnPeek = (Button)findViewById(R.id.button_peek) ;
        btnPeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                bottomSheetBehavior.setPeekHeight(150);
            }
        });

        Button btnCollapse = (Button)findViewById(R.id.button_collapse) ;
        btnCollapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                bottomSheetBehavior.setPeekHeight(100);
            }
        });

        Button btnTelegram = (Button)findViewById(R.id.button_telegram) ;
        btnTelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(viewBottomSheet,"You clicked the Telegram Button !",Snackbar.LENGTH_LONG).show();
            }
        });
    }

}