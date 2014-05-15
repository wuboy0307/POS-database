package com.wanyama.configuration;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.wanyama.database.DatabaseAdapter;
import com.wanyama.model.Stall;
import com.wanyama.posmanager.R;

public class EditStall extends Activity implements AdapterView.OnItemClickListener {

	private DatabaseAdapter db;
	private Context ctx;
	private ListView list;
	private List<Stall> listArray;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.master_list_stalls);
	    
	    list = (ListView) findViewById(R.id.listV);
	    ctx = this;
	    db = new DatabaseAdapter(ctx);
	    listArray = db.getAllStalls();
	    
	    ArrayAdapter<Stall> adapter = new ArrayAdapter<Stall>(ctx ,android.R.layout.simple_list_item_1, listArray);
	    list.setAdapter(adapter);
	    list.setOnItemClickListener(this);
	    
	    db.closeDB();
	   
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
	
		
	}

}