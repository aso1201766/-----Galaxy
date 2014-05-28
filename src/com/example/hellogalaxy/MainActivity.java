package com.example.hellogalaxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener
{

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){//どのボタンが押されらか判定
		case R.id.btnOK: //btnMsgが押された
			//エディットテキストから入力内容を取り出す
			EditText etv = (EditText)findViewById(R.id.edtFirst);
				String inputMsg = etv.getText().toString();
				EditText etv2 = (EditText)findViewById(R.id.edtFamily);
				String inputMsg2 = etv2.getText().toString();

				//メッセージ表示用のTextViewを探して、文字を設定
				TextView tv = (TextView)findViewById(R.id.txvMsg);
				tv.setText("あなたでしたか、" + inputMsg + inputMsg2 + "さん。");
				//インテントのインスタンス作成
				Intent intent = new Intent(MainActivity.this, MsgActivity.class);
				//次画面のアクティビティ起動
				startActivity(intent);


		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btnOK = (Button)findViewById(R.id.btnOK);
		//ボタン変数にリスナーを登録する
		btnOK.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
